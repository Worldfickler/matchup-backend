package com.example.usercenterbackendmaster.easyExcel;

import com.alibaba.excel.EasyExcel;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author dell
 * @date 2023/4/6 18:22
 * 导入星球数据库
 */
public class ImportPlanetUser {

    public static void main(String[] args) {
        //Excel数据文件放在自己电脑上，能够找到的路径
        String fileName = "C:\\Users\\dell\\Downloads\\testExcel.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<PlanetTableUserInfo> userInfoList =
                EasyExcel.read(fileName).head(PlanetTableUserInfo.class).sheet().doReadSync();
        System.out.println("总数 = " + userInfoList.size());
        Map<String, List<PlanetTableUserInfo>> listMap =
                userInfoList.stream()
                        .filter(userInfo -> StringUtils.isNotEmpty(userInfo.getUsername()))
                        .collect(Collectors.groupingBy(PlanetTableUserInfo::getUsername));
        for (Map.Entry<String, List<PlanetTableUserInfo>> stringListEntry : listMap.entrySet()) {
            if (stringListEntry.getValue().size() > 1) {
                System.out.println("username = " + stringListEntry.getKey());
                System.out.println("1");
            }
        }
        System.out.println("不重复昵称数 = " + listMap.keySet().size());
    }

}
