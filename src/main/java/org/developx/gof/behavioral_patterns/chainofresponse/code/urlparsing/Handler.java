package org.developx.gof.behavioral_patterns.chainofresponse.code.urlparsing;

public abstract class Handler {

    protected Handler nextHandler = null;

    public Handler setHandler(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    protected abstract void process(Url url);

    public void run(Url url) {
        process(url);
        if (nextHandler != null) {
            nextHandler.run(url);
        }
    }
}
