package log4jProject;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.RollingFileAppender;

public class Log4jTest {
	public RollingFileAppender r;
	public DailyRollingFileAppender d;
	public long maxFileSize = 10 * 1024 * 1024;

	public void setMaxFileSize() {
		r.setMaxFileSize("5KB");
	}

	public long getMaximumFileSize() {
		return maxFileSize;
	}
}
