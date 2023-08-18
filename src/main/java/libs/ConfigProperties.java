package libs;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:D:\\Natali\\Klets_G7_ExProject_UI_AQA\\G7-Klets-UI-ExProject\\src\\main\\resources\\config.properties") // path to config.properties
public interface ConfigProperties extends Config {
	long TIME_FOR_DEFAULT_WAIT();
	long TIME_FOR_EXPLICIT_WAIT_LOW();
	long TIME_FOR_EXPLICIT_WAIT_HIGH();

	String base_url();
	String DATA_FILE();
	String DATA_FILE_PATH();
	String Oracle();
	String MySQL();
	String sqlServer();

	String MySQL_DB();
	String MySQL_DB_USER();
	String MySQL_DB_PASSWORD();
}
