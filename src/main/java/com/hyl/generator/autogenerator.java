package com.hyl.generator;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;


public class autogenerator {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/ssmp?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("hyl");
        gc.setOpen(false);
        gc.setFileOverride(false);
        gc.setMapperName("%sDao");
        gc.setIdType(IdType.AUTO);
        mpg.setGlobalConfig(gc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.hyl");
        pc.setMapper("dao");
        mpg.setPackageInfo(pc);

//        策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setTablePrefix("tbl_");
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setLogicDeleteFieldName("deleted");
//        strategyConfig.setVersionFieldName("version");
        mpg.setStrategy(strategyConfig);

        mpg.execute();
    }

}
