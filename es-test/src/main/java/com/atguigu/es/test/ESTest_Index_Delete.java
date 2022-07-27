package com.atguigu.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * @Author LIXUBO
 * @Date 2022-07-27 15:51
 * @description
 * @Version 1.0
 */
public class ESTest_Index_Delete {
    public static void main(String[] args) throws Exception{
        //创建ES客户端
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200)));
        //查询索引
        DeleteIndexRequest request = new DeleteIndexRequest("user");
        AcknowledgedResponse response = esClient.indices().delete(request, RequestOptions.DEFAULT);
        //响应状态
        System.out.println(response.isAcknowledged());
        //关闭资源
        esClient.close();
    }
}
