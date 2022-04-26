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

    @Override
    protected String generatePushUrl(PushMetaInfo metaInfo) {
        return metaInfo.getToken() + "/sendMessage";
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
        return "token=" + metaInfo.getChatId() + "&priority=7&title=BILIBILI-HELPER任务简报&message="+content;

    }
}
