package top.misec.push.impl;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import top.misec.api.ApiList;
import top.misec.push.AbstractPush;
import top.misec.push.model.PushMetaInfo;

/**
 * Gotify推送 .
 *
 * @author itning
 * @since 2021/3/22 17:55
 */
public class GotifyPush extends AbstractPush {

    /**
     * 生成推送URL
     *
     * @param metaInfo 元信息
     * @return URL字符串
     */
    @Override
    protected String generatePushUrl(PushMetaInfo metaInfo) {
        return metaInfo.getToken() + "/message?token=" + metaInfo.getChatId();
    }

    @Override
    protected boolean checkPushStatus(JsonObject jsonObject) {
        if (null == jsonObject) {
            return false;
        }

        JsonElement ok = jsonObject.get("appid");
        if (null == ok) {
            return false;
        }

        return true;
    }

    @Override
    protected String generatePushBody(PushMetaInfo metaInfo, String content) {
        return "priority=7&title=BILIBILI-HELPER任务简报&message=" + content;

    }
}
