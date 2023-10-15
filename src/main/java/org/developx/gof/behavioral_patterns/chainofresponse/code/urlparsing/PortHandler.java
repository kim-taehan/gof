package org.developx.gof.behavioral_patterns.chainofresponse.code.urlparsing;

public class PortHandler extends Handler {
    @Override
    protected void process(Url url) {
        int index = url.getUrl().lastIndexOf(":");
        if (index != -1) {
            String strPort = url.getUrl().substring(index + 1);
            try {
                int port = Integer.parseInt((strPort));
                url.setPort(port);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("포트를 확인하세요");
            }
        }
    }
}