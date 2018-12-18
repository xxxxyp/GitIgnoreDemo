package TestEmail;
import java.util.List;

/**
 * Auto-generated: 2017-12-08 16:49:42
 *
 * @author Ryurian liu
 */
public class EmailRequestBase {
	
	private From from;
	private List<To> to;
	private String subject;
	private String content;
	private boolean isPlain;
	private String encoding;
	private String referId;
	
	
	
	public String getReferId() {
		return referId;
	}
	public void setReferId(String referId) {
		this.referId = referId;
	}
	public void setFrom(From from) {
		this.from = from;
	}
	public From getFrom() {
		return from;
	}
	
	public void setTo(List<To> to) {
		this.to = to;
	}
	public List<To> getTo() {
		return to;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	
	public boolean isPlain() {
		return isPlain;
	}
	public void setPlain(boolean isPlain) {
		this.isPlain = isPlain;
	}
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
}