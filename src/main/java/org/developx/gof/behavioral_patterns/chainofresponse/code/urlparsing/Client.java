package org.developx.gof.behavioral_patterns.chainofresponse.code.urlparsing;

public class Client {

    public static Url run(String url) {
        Url url1 = new Url(url);
        Handler handler = getHandlerFilter();
        handler.run(url1);
        return url1;
    }

    private static Handler getHandlerFilter() {
        Handler domainHandler = new DomainHandler();
        Handler portHandler = new PortHandler();
        Handler protocolHandler = new ProtocolHandler();

        portHandler.setHandler(domainHandler);
        protocolHandler.setHandler(portHandler);

        return protocolHandler;
    }
}
