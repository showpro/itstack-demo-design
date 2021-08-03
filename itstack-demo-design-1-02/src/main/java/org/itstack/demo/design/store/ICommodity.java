package org.itstack.demo.design.store;

import java.util.Map;

/**
 * 1、定义发奖接口
 */
public interface ICommodity {

    /**
     * @param uId         ⽤户ID
     * @param commodityId 奖品ID
     * @param bizId       业务ID
     * @param extMap      扩展字段
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
