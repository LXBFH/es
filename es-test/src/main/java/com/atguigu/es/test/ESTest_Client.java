package com.atguigu.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * @Author LIXUBO
 * @Date 2022-07-27 15:17
 * @description
 * @Version 1.0
 */
public class ESTest_Client {
    public static void main(String[] args) throws Exception{
        //创建ES客户端
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200)));
        //关闭资源
        esClient.close();

    }
}
