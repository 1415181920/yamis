package com.cocoyam.yaims;



/**
 * MultilineText
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class MultilineText extends BaseRenderer 
{
    public MultilineText()
    {
        set("type", "multiline-text");

    }

    /**
     * 容器 css 类名
     */
    public MultilineText className(Object value)
    {
        return set("className", value);
    }

    /**
     * 收起按钮文本
     */
    public MultilineText collapseButtonText(Object value)
    {
        return set("collapseButtonText", value);
    }

    /**
     * 是否禁用
     */
    public MultilineText disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public MultilineText disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 展开按钮文本
     */
    public MultilineText expendButtonText(Object value)
    {
        return set("expendButtonText", value);
    }

    /**
     * 是否隐藏
     */
    public MultilineText hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public MultilineText hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public MultilineText id(Object value)
    {
        return set("id", value);
    }

    /**
     * 最大行数
     */
    public MultilineText maxRows(Object value)
    {
        return set("maxRows", value);
    }

    /**
     * 事件动作配置
     */
    public MultilineText onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 是否静态展示
     */
    public MultilineText staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public MultilineText staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public MultilineText staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public MultilineText staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public MultilineText staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public MultilineText staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public MultilineText staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public MultilineText style(Object value)
    {
        return set("style", value);
    }

    /**
     * 文本
     */
    public MultilineText text(Object value)
    {
        return set("text", value);
    }

    public MultilineText type(Object value)
    {
        return set("type", value);
    }

    /**
     * 是否显示
     */
    public MultilineText visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public MultilineText visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public MultilineText set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
