package com.lantaiyuan.ebus.custom.model;

import java.util.Date;

import org.lanqiao.ssm.common.model.BaseModel;

/**
 *  车辆（站点）评价表
 * Evaluation
 * 数据库表：base_evaluation
 */
public class EvaluationQueryModel extends BaseModel<Evaluation> {
	/**
	  * @Fields serialVersionUID :
	  */
	private static final long serialVersionUID = 1L;

	/**
     * 自增主键
     * 表字段 : base_evaluation.id
     */
    private Integer id;

    /**
     * 评价对象名（车牌号或者站台名称）
     * 表字段 : base_evaluation.evaluatObjName
     */
    private String evaluatobjname;

    /**
     * 线路名称（当评价对象是站台时为空）
     * 表字段 : base_evaluation.routeName
     */
    private String routename;

    /**
     * 评价人
     * 表字段 : base_evaluation.userName
     */
    private String username;

    /**
     * 评价时间
     * 表字段 : base_evaluation.createTime
     */
    private Date createtime;

    /**
     * 评价类型( 1-未停靠途径站点       2-拥挤情况 3-突发事件   4-司机服务     5-整洁情况   6-车内温度   7-车站设施   8-大型活动)
     * 表字段 : base_evaluation.type
     */
    private Byte type;

    /**
     * 类型详情(11-默认 21-宽敞 22-半满 23-满座 24-拥挤 31-安全事故 32-医疗紧急情况 33-火警 34-其他 40-0颗星 41-1颗星 42-2颗星 43-3颗星 44-4颗星 45-5颗星 51-非常整洁 52-整洁 53-脏乱 54-十分脏乱 61-很冷 62-凉快 63-适宜 64-温暖 65-炎热 71-站台 72-电子站牌 73-电梯 74-其他 81-表演 82-特卖 83-音乐 84-其他)
     * 表字段 : base_evaluation.typeDetail
     */
    private Byte typedetail;

    /**
     * 评分
     * 表字段 : base_evaluation.score
     */
    private Double score;

    /**
     * 评价对象类型（B-车辆 S-站台）
     * 表字段 : base_evaluation.kind
     */
    private String kind;

    /**
     * 评价（更多细节）
     * 表字段 : base_evaluation.comment
     */
    private String comment;
    
   private String startdate;
    
    private String enddate;
    
    /**
     * 城市编码
     * 表字段 : base_evaluation.cityCode
     */
    private String citycode;
    
    /**
     * 获取 自增主键 字段:base_evaluation.id
     *
     * @return base_evaluation.id, 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 自增主键 字段:base_evaluation.id
     *
     * @param id the value for base_evaluation.id, 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 评价对象名（车牌号或者站台名称） 字段:base_evaluation.evaluatObjName
     *
     * @return base_evaluation.evaluatObjName, 评价对象名（车牌号或者站台名称）
     */
    public String getEvaluatobjname() {
        return evaluatobjname;
    }

    /**
     * 设置 评价对象名（车牌号或者站台名称） 字段:base_evaluation.evaluatObjName
     *
     * @param evaluatobjname the value for base_evaluation.evaluatObjName, 评价对象名（车牌号或者站台名称）
     */
    public void setEvaluatobjname(String evaluatobjname) {
        this.evaluatobjname = evaluatobjname == null ? null : evaluatobjname.trim();
    }

    /**
     * 获取 线路名称（当评价对象是站台时为空） 字段:base_evaluation.routeName
     *
     * @return base_evaluation.routeName, 线路名称（当评价对象是站台时为空）
     */
    public String getRoutename() {
        return routename;
    }

    /**
     * 设置 线路名称（当评价对象是站台时为空） 字段:base_evaluation.routeName
     *
     * @param routename the value for base_evaluation.routeName, 线路名称（当评价对象是站台时为空）
     */
    public void setRoutename(String routename) {
        this.routename = routename == null ? null : routename.trim();
    }

    /**
     * 获取 评价人 字段:base_evaluation.userName
     *
     * @return base_evaluation.userName, 评价人
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置 评价人 字段:base_evaluation.userName
     *
     * @param username the value for base_evaluation.userName, 评价人
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取 评价时间 字段:base_evaluation.createTime
     *
     * @return base_evaluation.createTime, 评价时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置 评价时间 字段:base_evaluation.createTime
     *
     * @param createtime the value for base_evaluation.createTime, 评价时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取 评价类型( 1-未停靠途径站点       2-拥挤情况 3-突发事件   4-司机服务     5-整洁情况   6-车内温度   7-车站设施   8-大型活动) 字段:base_evaluation.type
     *
     * @return base_evaluation.type, 评价类型( 1-未停靠途径站点       2-拥挤情况 3-突发事件   4-司机服务     5-整洁情况   6-车内温度   7-车站设施   8-大型活动)
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置 评价类型( 1-未停靠途径站点       2-拥挤情况 3-突发事件   4-司机服务     5-整洁情况   6-车内温度   7-车站设施   8-大型活动) 字段:base_evaluation.type
     *
     * @param type the value for base_evaluation.type, 评价类型( 1-未停靠途径站点       2-拥挤情况 3-突发事件   4-司机服务     5-整洁情况   6-车内温度   7-车站设施   8-大型活动)
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取 类型详情(11-默认 21-宽敞 22-半满 23-满座 24-拥挤 31-安全事故 32-医疗紧急情况 33-火警 34-其他 40-0颗星 41-1颗星 42-2颗星 43-3颗星 44-4颗星 45-5颗星 51-非常整洁 52-整洁 53-脏乱 54-十分脏乱 61-很冷 62-凉快 63-适宜 64-温暖 65-炎热 71-站台 72-电子站牌 73-电梯 74-其他 81-表演 82-特卖 83-音乐 84-其他) 字段:base_evaluation.typeDetail
     *
     * @return base_evaluation.typeDetail, 类型详情(11-默认 21-宽敞 22-半满 23-满座 24-拥挤 31-安全事故 32-医疗紧急情况 33-火警 34-其他 40-0颗星 41-1颗星 42-2颗星 43-3颗星 44-4颗星 45-5颗星 51-非常整洁 52-整洁 53-脏乱 54-十分脏乱 61-很冷 62-凉快 63-适宜 64-温暖 65-炎热 71-站台 72-电子站牌 73-电梯 74-其他 81-表演 82-特卖 83-音乐 84-其他)
     */
    public Byte getTypedetail() {
        return typedetail;
    }

    /**
     * 设置 类型详情(11-默认 21-宽敞 22-半满 23-满座 24-拥挤 31-安全事故 32-医疗紧急情况 33-火警 34-其他 40-0颗星 41-1颗星 42-2颗星 43-3颗星 44-4颗星 45-5颗星 51-非常整洁 52-整洁 53-脏乱 54-十分脏乱 61-很冷 62-凉快 63-适宜 64-温暖 65-炎热 71-站台 72-电子站牌 73-电梯 74-其他 81-表演 82-特卖 83-音乐 84-其他) 字段:base_evaluation.typeDetail
     *
     * @param typedetail the value for base_evaluation.typeDetail, 类型详情(11-默认 21-宽敞 22-半满 23-满座 24-拥挤 31-安全事故 32-医疗紧急情况 33-火警 34-其他 40-0颗星 41-1颗星 42-2颗星 43-3颗星 44-4颗星 45-5颗星 51-非常整洁 52-整洁 53-脏乱 54-十分脏乱 61-很冷 62-凉快 63-适宜 64-温暖 65-炎热 71-站台 72-电子站牌 73-电梯 74-其他 81-表演 82-特卖 83-音乐 84-其他)
     */
    public void setTypedetail(Byte typedetail) {
        this.typedetail = typedetail;
    }

    /**
     * 获取 评分 字段:base_evaluation.score
     *
     * @return base_evaluation.score, 评分
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置 评分 字段:base_evaluation.score
     *
     * @param score the value for base_evaluation.score, 评分
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 获取 评价对象类型（B-车辆 S-站台） 字段:base_evaluation.kind
     *
     * @return base_evaluation.kind, 评价对象类型（B-车辆 S-站台）
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置 评价对象类型（B-车辆 S-站台） 字段:base_evaluation.kind
     *
     * @param kind the value for base_evaluation.kind, 评价对象类型（B-车辆 S-站台）
     */
    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    /**
     * 获取 评价（更多细节） 字段:base_evaluation.comment
     *
     * @return base_evaluation.comment, 评价（更多细节）
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置 评价（更多细节） 字段:base_evaluation.comment
     *
     * @param comment the value for base_evaluation.comment, 评价（更多细节）
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

	/**
	 * @return the startdate
	 */
	public String getStartdate() {
		return startdate;
	}

	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	/**
	 * @return the enddate
	 */
	public String getEnddate() {
		return enddate;
	}

	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	/**
	 * @return the citycode
	 */
	public String getCitycode() {
		return citycode;
	}

	/**
	 * @param citycode the citycode to set
	 */
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
}