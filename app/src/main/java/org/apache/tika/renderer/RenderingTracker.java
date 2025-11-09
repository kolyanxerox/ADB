package org.apache.tika.renderer;

/* loaded from: classes3.dex */
public class RenderingTracker {

    /* renamed from: id */
    private int f13238id = 0;

    public synchronized int getNextId() {
        int i;
        i = this.f13238id + 1;
        this.f13238id = i;
        return i;
    }
}
