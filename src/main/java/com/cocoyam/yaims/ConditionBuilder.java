package com.cocoyam.yaims;



/**
 * 条件组合控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/condition-builder
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class ConditionBuilder extends BaseRenderer {

    public ConditionBuilder()
    {
        set("type", "condition-builder");
    }

    /**
     * 展现模式 可选值: simple | full
     */
    public ConditionBuilder builderMode(Object value)
    {
        return set("builderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public ConditionBuilder className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public ConditionBuilder clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 其他配置
     */
    public ConditionBuilder config(Object value)
    {
        return set("config", value);
    }

    public ConditionBuilder desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public ConditionBuilder description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public ConditionBuilder descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public ConditionBuilder disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public ConditionBuilder disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 内嵌模式，默认为 true
     */
    public ConditionBuilder embed(boolean value)
    {
        return set("embed", value);
    }

    /**
     * 字段集合
     */
    public ConditionBuilder fields(Object value)
    {
        return set("fields", value);
    }

    /**
     * 函数集合
     */
    public ConditionBuilder funcs(Object value)
    {
        return set("funcs", value);
    }

    /**
     * 是否隐藏
     */
    public ConditionBuilder hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public ConditionBuilder hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public ConditionBuilder hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public ConditionBuilder horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public ConditionBuilder id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public ConditionBuilder inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public ConditionBuilder inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public ConditionBuilder label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public ConditionBuilder labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public ConditionBuilder labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public ConditionBuilder labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public ConditionBuilder labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public ConditionBuilder mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public ConditionBuilder name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public ConditionBuilder onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 非内嵌模式时 弹窗触发icon
     */
    public ConditionBuilder pickerIcon(Object value)
    {
        return set("pickerIcon", value);
    }

    /**
     * 占位符
     */
    public ConditionBuilder placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public ConditionBuilder readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public ConditionBuilder readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public ConditionBuilder remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public ConditionBuilder required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 是否显示并或切换键按钮，只在简单模式下有用
     */
    public ConditionBuilder showANDOR(boolean value)
    {
        return set("showANDOR", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public ConditionBuilder size(Object value)
    {
        return set("size", value);
    }

    /**
     * 通过远程拉取配置项
     */
    public ConditionBuilder source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public ConditionBuilder staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public ConditionBuilder staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public ConditionBuilder staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public ConditionBuilder staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public ConditionBuilder staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public ConditionBuilder staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public ConditionBuilder staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public ConditionBuilder style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public ConditionBuilder submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为
     */
    public ConditionBuilder type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public ConditionBuilder validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public ConditionBuilder validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public ConditionBuilder validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public ConditionBuilder validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public ConditionBuilder value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public ConditionBuilder visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public ConditionBuilder visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public ConditionBuilder width(Object value)
    {
        return set("width", value);
    }


    public ConditionBuilder set(String key, Object value) {
        super.set(key, value);
        return this;
    }
}
