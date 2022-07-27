package com.atguigu.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;

/**
 * @Author LIXUBO
 * @Date 2022-07-27 15:36
 * @description
 * @Version 1.0
 */
public class ESTest_Index_Create {
    public static void main(String[] args) throws Exception{
        //创建ES客户端
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200)));
        //创建索引
        CreateIndexRequest request = new CreateIndexRequest("user2");
        CreateIndexResponse createIndexResponse =
                esClient.indices().create(request, RequestOptions.DEFAULT);
        //响应状态
        boolean acknowledged = createIndexResponse.isAcknowledged();
        System.out.println("索引操作："+acknowledged);
        //关闭资源
        esClient.close();

    }
}
