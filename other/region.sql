/*
Navicat MySQL Data Transfer

Source Server         : localhsot
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : dpms_info

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2017-12-06 16:27:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for region
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `region_code` int(11) unsigned NOT NULL,
  `city_code` int(11) NOT NULL,
  `region_` varchar(255) NOT NULL,
  `region_people_number` int(11) NOT NULL,
  PRIMARY KEY (`region_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of region
-- ----------------------------
INSERT INTO `region` VALUES ('510104', '510100', '锦江区', '699300');
INSERT INTO `region` VALUES ('510105', '510100', '青羊区', '841000');
INSERT INTO `region` VALUES ('510106', '510100', '金牛区', '1203500');
INSERT INTO `region` VALUES ('510107', '510100', '武侯区', '1725100');
INSERT INTO `region` VALUES ('510108', '510100', '成华区', '944000');
INSERT INTO `region` VALUES ('510112', '510100', '龙泉驿区', '840200');
INSERT INTO `region` VALUES ('510113', '510100', '青白江区', '398700');
INSERT INTO `region` VALUES ('510114', '510100', '新都区', '848600');
INSERT INTO `region` VALUES ('510115', '510100', '温江区', '495600');
INSERT INTO `region` VALUES ('510116', '510100', '双流区', '1302900');
INSERT INTO `region` VALUES ('510121', '510100', '金堂县', '725800');
INSERT INTO `region` VALUES ('510124', '510100', '郫县', '825200');
INSERT INTO `region` VALUES ('510129', '510100', '大邑县', '507800');
INSERT INTO `region` VALUES ('510131', '510100', '蒲江县', '253600');
INSERT INTO `region` VALUES ('510132', '510100', '新津县', '312600');
INSERT INTO `region` VALUES ('510181', '510100', '都江堰市', '680200');
INSERT INTO `region` VALUES ('510182', '510100', '彭州市', '771300');
INSERT INTO `region` VALUES ('510183', '510100', '邛崃市', '617800');
INSERT INTO `region` VALUES ('510184', '510100', '崇州市', '664300');
INSERT INTO `region` VALUES ('510185', '510100', '简阳市', '1052200');
INSERT INTO `region` VALUES ('510302', '510300', '自流井区', '410500');
INSERT INTO `region` VALUES ('510303', '510300', '贡井区', '264600');
INSERT INTO `region` VALUES ('510304', '510300', '大安区', '379000');
INSERT INTO `region` VALUES ('510311', '510300', '沿滩区', '294800');
INSERT INTO `region` VALUES ('510321', '510300', '荣县', '591200');
INSERT INTO `region` VALUES ('510322', '510300', '富顺县', '830100');
INSERT INTO `region` VALUES ('510402', '510400', '东区', '383000');
INSERT INTO `region` VALUES ('510403', '510400', '西区', '149600');
INSERT INTO `region` VALUES ('510411', '510400', '仁和区', '270900');
INSERT INTO `region` VALUES ('510421', '510400', '米易县', '228600');
INSERT INTO `region` VALUES ('510422', '510400', '盐边县', '200400');
INSERT INTO `region` VALUES ('510502', '510500', '江阳区', '607000');
INSERT INTO `region` VALUES ('510503', '510500', '纳溪区', '461100');
INSERT INTO `region` VALUES ('510504', '510500', '龙马潭区', '359700');
INSERT INTO `region` VALUES ('510521', '510500', '泸县', '866200');
INSERT INTO `region` VALUES ('510522', '510500', '合江县', '708700');
INSERT INTO `region` VALUES ('510524', '510500', '叙永县', '579600');
INSERT INTO `region` VALUES ('510525', '510500', '古蔺县', '702900');
INSERT INTO `region` VALUES ('510603', '510600', '旌阳区', '747000');
INSERT INTO `region` VALUES ('510623', '510600', '中江县', '1081000');
INSERT INTO `region` VALUES ('510626', '510600', '罗江县', '221000');
INSERT INTO `region` VALUES ('510681', '510600', '广汉市', '592000');
INSERT INTO `region` VALUES ('510682', '510600', '什邡市', '418100');
INSERT INTO `region` VALUES ('510683', '510600', '绵竹市', '454099');
INSERT INTO `region` VALUES ('510703', '510700', '涪城区', '875600');
INSERT INTO `region` VALUES ('510704', '510700', '游仙区', '525000');
INSERT INTO `region` VALUES ('510705', '510700', '安州区', '387000');
INSERT INTO `region` VALUES ('510722', '510700', '三台县', '1049200');
INSERT INTO `region` VALUES ('510723', '510700', '盐亭县', '451000');
INSERT INTO `region` VALUES ('510725', '510700', '梓潼县', '305900');
INSERT INTO `region` VALUES ('510726', '510700', '北川羌族自治县', '212700');
INSERT INTO `region` VALUES ('510727', '510700', '平武县', '172100');
INSERT INTO `region` VALUES ('510781', '510700', '江油市', '793400');
INSERT INTO `region` VALUES ('510802', '510800', '利州区', '549000');
INSERT INTO `region` VALUES ('510811', '510800', '昭化区', '183400');
INSERT INTO `region` VALUES ('510812', '510800', '朝天区', '192000');
INSERT INTO `region` VALUES ('510821', '510800', '旺苍县', '406200');
INSERT INTO `region` VALUES ('510822', '510800', '青川县', '211700');
INSERT INTO `region` VALUES ('510823', '510800', '剑阁县', '481700');
INSERT INTO `region` VALUES ('510824', '510800', '苍溪县', '606000');
INSERT INTO `region` VALUES ('510903', '510900', '船山区', '668500');
INSERT INTO `region` VALUES ('510904', '510900', '安居区', '645699');
INSERT INTO `region` VALUES ('510921', '510900', '蓬溪县', '559400');
INSERT INTO `region` VALUES ('510922', '510900', '射洪县', '931800');
INSERT INTO `region` VALUES ('510923', '510900', '大英县', '484600');
INSERT INTO `region` VALUES ('511002', '511000', '内江市中区', '520700');
INSERT INTO `region` VALUES ('511011', '511000', '东兴区', '765300');
INSERT INTO `region` VALUES ('511024', '511000', '威远县', '595700');
INSERT INTO `region` VALUES ('511025', '511000', '资中县', '1211200');
INSERT INTO `region` VALUES ('511028', '511000', '隆昌县', '646800');
INSERT INTO `region` VALUES ('511102', '511100', '乐山市中区', '679500');
INSERT INTO `region` VALUES ('511111', '511100', '沙湾区', '177300');
INSERT INTO `region` VALUES ('511112', '511100', '五通桥区', '322400');
INSERT INTO `region` VALUES ('511113', '511100', '金口河区', '49000');
INSERT INTO `region` VALUES ('511123', '511100', '犍为县', '423300');
INSERT INTO `region` VALUES ('511124', '511100', '井研县', '296000');
INSERT INTO `region` VALUES ('511126', '511100', '夹江县', '332700');
INSERT INTO `region` VALUES ('511129', '511100', '沐川县', '211800');
INSERT INTO `region` VALUES ('511132', '511100', '峨边彝族自治县', '135800');
INSERT INTO `region` VALUES ('511133', '511100', '马边彝族自治县', '184600');
INSERT INTO `region` VALUES ('511181', '511100', '峨眉山市', '448100');
INSERT INTO `region` VALUES ('511302', '511300', '顺庆区', '711900');
INSERT INTO `region` VALUES ('511303', '511300', '高坪区', '603900');
INSERT INTO `region` VALUES ('511304', '511300', '嘉陵区', '615300');
INSERT INTO `region` VALUES ('511321', '511300', '南部县', '934200');
INSERT INTO `region` VALUES ('511322', '511300', '营山县', '743000');
INSERT INTO `region` VALUES ('511323', '511300', '蓬安县', '569100');
INSERT INTO `region` VALUES ('511324', '511300', '仪陇县', '929500');
INSERT INTO `region` VALUES ('511325', '511300', '西充县', '528600');
INSERT INTO `region` VALUES ('511381', '511300', '阆中市', '728500');
INSERT INTO `region` VALUES ('511402', '511400', '东坡区', '839200');
INSERT INTO `region` VALUES ('511403', '511400', '彭山区', '317900');
INSERT INTO `region` VALUES ('511421', '511400', '仁寿县', '1226200');
INSERT INTO `region` VALUES ('511423', '511400', '洪雅县', '307300');
INSERT INTO `region` VALUES ('511424', '511400', '丹棱县', '143200');
INSERT INTO `region` VALUES ('511425', '511400', '青神县', '167500');
INSERT INTO `region` VALUES ('511502', '511500', '翠屏区', '852600');
INSERT INTO `region` VALUES ('511503', '511500', '南溪区', '341000');
INSERT INTO `region` VALUES ('511521', '511500', '宜宾县', '771800');
INSERT INTO `region` VALUES ('511523', '511500', '江安县', '417100');
INSERT INTO `region` VALUES ('511524', '511500', '长宁县', '344500');
INSERT INTO `region` VALUES ('511525', '511500', '高县', '414000');
INSERT INTO `region` VALUES ('511526', '511500', '珙县', '374000');
INSERT INTO `region` VALUES ('511527', '511500', '筠连县', '332400');
INSERT INTO `region` VALUES ('511528', '511500', '兴文县', '386500');
INSERT INTO `region` VALUES ('511529', '511500', '屏山县', '256100');
INSERT INTO `region` VALUES ('511602', '511600', '广安区', '615400');
INSERT INTO `region` VALUES ('511603', '511600', '前锋区', '256000');
INSERT INTO `region` VALUES ('511621', '511600', '岳池县', '788000');
INSERT INTO `region` VALUES ('511622', '511600', '武胜县', '590200');
INSERT INTO `region` VALUES ('511623', '511600', '邻水县', '714300');
INSERT INTO `region` VALUES ('511681', '511600', '华蓥市', '282700');
INSERT INTO `region` VALUES ('511702', '511700', '通川区', '633200');
INSERT INTO `region` VALUES ('511703', '511700', '达川区', '1020400');
INSERT INTO `region` VALUES ('511722', '511700', '宣汉县', '1029800');
INSERT INTO `region` VALUES ('511723', '511700', '开江县', '449700');
INSERT INTO `region` VALUES ('511724', '511700', '大竹县', '888600');
INSERT INTO `region` VALUES ('511725', '511700', '渠县', '1129800');
INSERT INTO `region` VALUES ('511781', '511700', '万源市', '416100');
INSERT INTO `region` VALUES ('511802', '511800', '雨城区', '366400');
INSERT INTO `region` VALUES ('511803', '511800', '名山区', '266700');
INSERT INTO `region` VALUES ('511822', '511800', '荥经县', '150700');
INSERT INTO `region` VALUES ('511823', '511800', '汉源县', '318000');
INSERT INTO `region` VALUES ('511824', '511800', '石棉县', '127700');
INSERT INTO `region` VALUES ('511825', '511800', '天全县', '138600');
INSERT INTO `region` VALUES ('511826', '511800', '芦山县', '120700');
INSERT INTO `region` VALUES ('511827', '511800', '宝兴县', '58000');
INSERT INTO `region` VALUES ('511902', '511900', '巴州区', '721400');
INSERT INTO `region` VALUES ('511903', '511900', '恩阳区', '436700');
INSERT INTO `region` VALUES ('511921', '511900', '通江县', '713300');
INSERT INTO `region` VALUES ('511922', '511900', '南江县', '615700');
INSERT INTO `region` VALUES ('511923', '511900', '平昌县', '841500');
INSERT INTO `region` VALUES ('512002', '512000', '雁江区', '877800');
INSERT INTO `region` VALUES ('512021', '512000', '安岳县', '1124100');
INSERT INTO `region` VALUES ('512022', '512000', '乐至县', '515200');
INSERT INTO `region` VALUES ('513201', '513200', '马尔康市', '59600');
INSERT INTO `region` VALUES ('513221', '513200', '汶川县', '97500');
INSERT INTO `region` VALUES ('513222', '513200', '理县', '48099');
INSERT INTO `region` VALUES ('513223', '513200', '茂县', '107600');
INSERT INTO `region` VALUES ('513224', '513200', '松潘县', '74800');
INSERT INTO `region` VALUES ('513225', '513200', '九寨沟县', '81900');
INSERT INTO `region` VALUES ('513226', '513200', '金川县', '74000');
INSERT INTO `region` VALUES ('513227', '513200', '小金县', '79800');
INSERT INTO `region` VALUES ('513228', '513200', '黑水县', '63700');
INSERT INTO `region` VALUES ('513230', '513200', '壤塘县', '41600');
INSERT INTO `region` VALUES ('513231', '513200', '阿坝县', '75200');
INSERT INTO `region` VALUES ('513232', '513200', '若尔盖县', '78100');
INSERT INTO `region` VALUES ('513233', '513200', '红原县', '48200');
INSERT INTO `region` VALUES ('513301', '513300', '康定市', '133800');
INSERT INTO `region` VALUES ('513322', '513300', '泸定县', '88699');
INSERT INTO `region` VALUES ('513323', '513300', '丹巴县', '70300');
INSERT INTO `region` VALUES ('513324', '513300', '九龙县', '66400');
INSERT INTO `region` VALUES ('513325', '513300', '雅江县', '53099');
INSERT INTO `region` VALUES ('513326', '513300', '道孚县', '58400');
INSERT INTO `region` VALUES ('513327', '513300', '炉霍县', '48400');
INSERT INTO `region` VALUES ('513328', '513300', '甘孜县', '72000');
INSERT INTO `region` VALUES ('513329', '513300', '新龙县', '50900');
INSERT INTO `region` VALUES ('513330', '513300', '德格县', '85500');
INSERT INTO `region` VALUES ('513331', '513300', '白玉县', '59100');
INSERT INTO `region` VALUES ('513332', '513300', '石渠县', '99700');
INSERT INTO `region` VALUES ('513333', '513300', '色达县', '61000');
INSERT INTO `region` VALUES ('513334', '513300', '理塘县', '72000');
INSERT INTO `region` VALUES ('513335', '513300', '巴塘县', '50800');
INSERT INTO `region` VALUES ('513336', '513300', '乡城县', '34500');
INSERT INTO `region` VALUES ('513337', '513300', '稻城县', '32700');
INSERT INTO `region` VALUES ('513338', '513300', '得荣县', '27599');
INSERT INTO `region` VALUES ('513401', '513400', '西昌市', '754000');
INSERT INTO `region` VALUES ('513422', '513400', '木里藏族自治县', '133000');
INSERT INTO `region` VALUES ('513423', '513400', '盐源县', '361000');
INSERT INTO `region` VALUES ('513424', '513400', '德昌县', '219000');
INSERT INTO `region` VALUES ('513425', '513400', '会理县', '442000');
INSERT INTO `region` VALUES ('513426', '513400', '会东县', '374000');
INSERT INTO `region` VALUES ('513427', '513400', '宁南县', '184000');
INSERT INTO `region` VALUES ('513428', '513400', '普格县', '162000');
INSERT INTO `region` VALUES ('513429', '513400', '布拖县', '168000');
INSERT INTO `region` VALUES ('513430', '513400', '金阳县', '170000');
INSERT INTO `region` VALUES ('513431', '513400', '昭觉县', '256000');
INSERT INTO `region` VALUES ('513432', '513400', '喜德县', '169000');
INSERT INTO `region` VALUES ('513433', '513400', '冕宁县', '357000');
INSERT INTO `region` VALUES ('513434', '513400', '越西县', '282000');
INSERT INTO `region` VALUES ('513435', '513400', '甘洛县', '198000');
INSERT INTO `region` VALUES ('513436', '513400', '美姑县', '223000');
INSERT INTO `region` VALUES ('513437', '513400', '雷波县', '228000');
