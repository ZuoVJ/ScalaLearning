
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailTest {

    public static void main(String[] args) throws MessagingException {
        Properties prop=new Properties();
        prop.put("mail.host","smtp.163.com" );
        prop.put("mail.transport.protocol", "smtp");
        prop.put("mail.smtp.auth", true);
        //使用java发送邮件5步骤
        //1.创建sesssion
        Session session=Session.getInstance(prop);
        //开启session的调试模式，可以查看当前邮件发送状态
        session.setDebug(true);
        //2.通过session获取Transport对象（发送邮件的核心API）
        Transport ts=session.getTransport();
        //3.通过邮件用户名密码链接
        ts.connect("15113828343@163.com", "wyzuo19941204");
        //4.创建邮件
        Message msg=createSimpleMail(session);
        //5.发送电子邮件
        ts.sendMessage(msg, msg.getAllRecipients());
    }

    public static MimeMessage createSimpleMail(Session session) throws AddressException,MessagingException{
        //创建邮件对象
        MimeMessage mm=new MimeMessage(session);
        //设置发件人
        mm.setFrom(new InternetAddress("15113828343@163.com"));
        //设置收件人
        mm.setRecipient(Message.RecipientType.TO, new InternetAddress("755293352@qq.com"));
        //设置抄送人
//        mm.setRecipient(Message.RecipientType.CC, new InternetAddress("用户名@163.com"));

        mm.setSubject("第一封JAVA邮件！");
        mm.setContent("咱们开会把", "text/html;charset=gbk");

        return mm;

    }

}
