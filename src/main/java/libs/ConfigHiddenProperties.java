package libs;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:D:\\Natali\\Klets_G7_ExProject_UI_AQA\\G7-Klets-UI-ExProject\\src\\main\\resources\\hiddenConfig.properties")
public interface ConfigHiddenProperties extends Config {
    String login();
    String password();

}
