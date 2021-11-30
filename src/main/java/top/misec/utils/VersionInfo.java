package top.misec.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * version info.
 *
 * @author Junzhou Liu
 * @since 2020/11/21 15:22
 */
@Slf4j
@Data
public class VersionInfo {
    public static void printVersionInfo() {
        log.info("---程序初始化---");
    }
}
