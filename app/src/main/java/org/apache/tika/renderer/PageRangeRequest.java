package org.apache.tika.renderer;

import java.util.Objects;

/* loaded from: classes3.dex */
public class PageRangeRequest implements RenderRequest {
    public static PageRangeRequest RENDER_ALL = new PageRangeRequest(1, -1);
    private final int from;

    /* renamed from: to */
    private final int f13236to;

    public PageRangeRequest(int i, int i2) {
        this.from = i;
        this.f13236to = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PageRangeRequest pageRangeRequest = (PageRangeRequest) obj;
            if (this.from == pageRangeRequest.from && this.f13236to == pageRangeRequest.f13236to) {
                return true;
            }
        }
        return false;
    }

    public int getFrom() {
        return this.from;
    }

    public int getTo() {
        return this.f13236to;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.from), Integer.valueOf(this.f13236to));
    }
}
