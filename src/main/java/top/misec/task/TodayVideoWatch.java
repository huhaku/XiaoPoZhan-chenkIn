package top.misec.task;

import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import top.misec.api.ApiList;
import top.misec.api.OftenApi;
import top.misec.config.ConfigLoader;
import top.misec.utils.HttpUtils;
import top.misec.utils.SleepTime;

import java.util.Random;

import static top.misec.task.DailyTask.getDailyTaskStatus;
import static top.misec.task.TaskInfoHolder.STATUS_CODE_STR;
import static top.misec.task.TaskInfoHolder.getVideoId;

/**
 * 观看分享视频.
 *
 * @author @JunzhouLiu @Kurenai
 * @since 2020-11-22 5:13
 */
@Slf4j
public class TodayVideoWatch extends VideoWatch {

    @Override
    public void run() {
        int seeNum = new Random().nextInt(2);
        log.info("随机观看{}个视频",seeNum);
        for (int i = 0; i < seeNum; i++) {
            String bvid = getVideoId.getRegionRankingVideoBvid();
            watchVideo(bvid);
            new SleepTime().sleepDefault(3);
        }
    }

    @Override
    public String getName() {
        return "今日固定观看分享视频";
    }
}
