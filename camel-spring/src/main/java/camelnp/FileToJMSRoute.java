/**
 * 
 */
package camelnp;

import org.apache.camel.builder.RouteBuilder;

public class FileToJMSRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("ftp://localhost/orders?username=SaiKiran&password=India@123").to("jms:incomingOrders");
    }
}
