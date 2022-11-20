# hlwjs-howework

citycode那个模块暂时没有用，腾讯api是直接名字调用

## 腾讯天气API抓取

> 免费的那个api城市特别的少，所以一开始用的sql+redis+mybaris的天气获取方式不太好，然后就用了最简单的腾讯天气的api，省去了大部分的工作，后面可以看情况加上sql

### 请求接口

这是腾讯天气的通用请求接口

    https://wis.qq.com/weather/common

### 请求参数

| 参数         | 含义                                                         |
| ------------ | ------------------------------------------------------------ |
| source       | 请求来源，可以填 pc 即来自PC端                               |
| province     | 省，比如山东省                                               |
| city         | 市，比如临沂市                                               |
| country      | 县区，比如兰山区                                             |
| weather_type | 请求的天气类型，这里是最重要的，参数有：observe(观测站数据，例如温度大气压)，forecast_1h（按小时预报），forecast_24h（按天预报），index（指数，比如穿衣指数等），alarm（警告），limit，tips（小提示），rise（日出日落，月出月落），air（空气质量）等 |

### 使用说明

GET请求后面的weather_type内容参数之间用 | 分割，然后再进行URL编码。province和city也要经过URL编码。

**目前使用的是下面的**

```
https://wis.qq.com/weather/common?source=pc&weather_type=observe|forecast_24h|air&province={province}&city={city}&county={country}
```

## 详细说明

### TencentApiService

调用接口是用Feign

```java
@FeignClient(name = "TencentWeatherAPi",url = "https://wis.qq.com/weather",configuration = DecoderConfig.class)
public interface TencentApiService {
@RequestMapping(value = "/common?source=pc&weather_type=observe|forecast_24h|air&province={province}&city={city}&county={country}", method = RequestMethod.GET)
JsonElement getWeather(@PathVariable("province") String province, @PathVariable("city") String city, @PathVariable("country") String country);
}
```

这是请求

```
https://wis.qq.com/weather/common?source=pc&weather_type=observe|forecast_24h|air&province={province}&city={city}&county={country}
```

大括号里面是参数，然后spingboot会自动生成getWeather函数返回JsonElement

> configuration = DecoderConfig.class是把默认的SpringDecoder换成GsonDecoder，主要是因为GsonDecoder可以使用@SerializedName注解

### WeatherController

WeatherController用来接受微信前端发来的get请求

```java
@RestController//@RestController 如果只是接口，那么就用 RestController 来注解.
public class WeatherController {

    @Autowired//@Service或者@Controller或@Component或@Repository注解之后，spring的组件扫描就会自动发现它，并且会将其初始化为spring应用上下文中的bean。
    private TencentWeatherService tencentWeatherService;
    @GetMapping(value = "/get.do")//处理get请求的映射-->@GetMapping
    public TencentWeather get(String province, String city, String country){
        return tencentWeatherService.getWeatherInfo(province, city, country);
    }
}
```

前端代码

```js
        wx.request({
          url: 'http://localhost:12346/get.do',
          data: {
            province:res.result.ad_info.province,
            city: res.result.ad_info.city,
            country: res.result.ad_info.district
          }
            ...
        })
```

### entity.dto包下的类

这是实体类用来把腾讯api得到的JsonElement对象转换成java对象（POJO）

> DTO代表服务层需要接收的数据和返回的数据，而VO代表展示层需要显示的数据。

### entity.dto包下的类

这是Ioc注入，impl的意思是实现类，service是接口，先写接口再写实现类。

然后在controller包下面可以@Autowired自动注入

## 加接口功能

基本上照着已经写的样子写就可以了，只要实体类(entity.dto包下的类)写的对,

gsonDecoder可以帮完成实现。

> 在写entity.dto包下的类的时候按照我的那个样子写，类的名字要和json上面的一样，如果无法一样，在上面加上@SerializedName("json的key")注解

## 暂时配的接口

看json包有没有问题

```
localhost:12346/weather/tx/江苏省/南京市/玄武区
```

前端调用的接口

```
http://localhost:12346/get.do
```

