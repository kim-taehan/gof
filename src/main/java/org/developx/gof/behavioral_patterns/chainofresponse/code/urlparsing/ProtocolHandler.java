package org.developx.gof.behavioral_patterns.chainofresponse.code.urlparsing;

public class ProtocolHandler extends Handler{
    @Override
    protected void process(Url url) {
        int index = url.getUrl().indexOf("://");
        if (index != -1) {
           url.setProtocol(url.getUrl().substring(0, index));
        } else {
            System.out.println("NO PROTOCOL");
            url.setProtocol(null);
        }
    }
}
