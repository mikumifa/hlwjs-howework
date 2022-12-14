package com.hlwjs.api.entity.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:34
 **/
@ToString
@Data
public class TencentWeather implements Serializable {
    private Data data;
    private String message;
    private String status;
    @lombok.Data
    public class Data implements Serializable {
        private Air air;
        @SerializedName("forecast_24h")
        private Forecast_24h forecast_24h;
        private Observe observe;
        private Index index;
        @SerializedName("tips")
        private Tips tips;
        @lombok.Data
        public class Index implements Serializable {

            private IndexContext airconditioner;
            private IndexContext allergy;
            private IndexContext carwash;
            private IndexContext chill;
            private IndexContext clothes;
            private IndexContext cold;
            private IndexContext comfort;
            private IndexContext diffusion;
            private IndexContext dry;
            private IndexContext drying;
            private IndexContext fish;
            private IndexContext heatstroke;
            private IndexContext makeup;
            private IndexContext mood;
            private IndexContext morning;
            private IndexContext sports;
            private IndexContext sunglasses;
            private IndexContext sunscreen;
            private String time;
            private IndexContext tourism;
            private IndexContext traffic;
            private IndexContext ultraviolet;
            private IndexContext umbrella;
            @lombok.Data
            public class IndexContext implements Serializable {
                private String detail;
                private String info;
                private String name;
            }
        }
        @lombok.Data
        public class Tips implements Serializable {
            @SerializedName("observe")
            private TipsDetail tipsDetail;
            @lombok.Data
            public class TipsDetail implements Serializable {
                @SerializedName("0")
                private String tips_0;
                @SerializedName("1")
                private String tips_1;
                @SerializedName("2")
                private String tips_2;
                @SerializedName("3")
                private String tips_3;
                @SerializedName("4")
                private String tips_4;
            }

        }
        @lombok.Data
        public class Air implements Serializable {
            private String aqi;
            private String aqi_level;
            private String aqi_name;
            private String co;
            private String no2;
            private String o3;
            private String pm10;
            @SerializedName("pm2.5")
            private String pm2_5;
            private String so2;
            private String update_time;
        }

        @lombok.Data
        public class Forecast_24h implements Serializable {
            @SerializedName("0")
            private WeatherDay weatherDay_0;
            @SerializedName("1")
            private WeatherDay weatherDay_1;
            @SerializedName("2")
            private WeatherDay weatherDay_2;
            @SerializedName("3")
            private WeatherDay weatherDay_3;
            @SerializedName("4")
            private WeatherDay weatherDay_4;
            @SerializedName("5")
            private WeatherDay weatherDay_5;
            @SerializedName("6")
            private WeatherDay weatherDay_6;
            @SerializedName("7")
            private WeatherDay weatherDay_7;

            @lombok.Data
            public class WeatherDay {
                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private Date time;
            }
        }
        @lombok.Data
        public class Observe {
            private String degree;
            private String humidity;
            private String precipitation;
            private String pressure;
            private String update_time;
            private String weather;
            private String weather_code;
            private String weather_short;
            private String wind_direction;
            private String wind_power;
        }


    }
}
