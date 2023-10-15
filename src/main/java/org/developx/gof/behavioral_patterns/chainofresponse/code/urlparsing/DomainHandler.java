package org.developx.gof.behavioral_patterns.chainofresponse.code.urlparsing;

public class DomainHandler extends Handler{
    @Override
    protected void process(Url url) {
        String urlStr = url.getUrl();
        int startIndex = urlStr.indexOf("://");
        int lastIndex = urlStr.lastIndexOf(":");
        String domain = findDomain(urlStr, startIndex, lastIndex);
        url.setDomain(domain);
    }

    private String findDomain(String urlStr, int startIndex, int lastIndex) {
        if (startIndex == -1) {
            if (lastIndex == -1) {
                return urlStr;
            } else {
                return urlStr.substring(0, lastIndex);
            }
        } else if (startIndex != lastIndex) {
            return urlStr.substring(startIndex + 3, lastIndex);
        } else {
            return urlStr.substring(startIndex + 3);
        }
    }
}
