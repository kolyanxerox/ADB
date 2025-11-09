package org.apache.tika.pipes.fetcher;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public class FetchKey implements Serializable {
    private static final long serialVersionUID = -3861669115439125268L;
    private String fetchKey;
    private String fetcherName;
    private long rangeEnd;
    private long rangeStart;

    public FetchKey() {
        this.rangeStart = -1L;
        this.rangeEnd = -1L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FetchKey fetchKey = (FetchKey) obj;
            if (this.rangeStart == fetchKey.rangeStart && this.rangeEnd == fetchKey.rangeEnd && Objects.equals(this.fetcherName, fetchKey.fetcherName) && Objects.equals(this.fetchKey, fetchKey.fetchKey)) {
                return true;
            }
        }
        return false;
    }

    public String getFetchKey() {
        return this.fetchKey;
    }

    public String getFetcherName() {
        return this.fetcherName;
    }

    public long getRangeEnd() {
        return this.rangeEnd;
    }

    public long getRangeStart() {
        return this.rangeStart;
    }

    public boolean hasRange() {
        return this.rangeStart > -1 && this.rangeEnd > -1;
    }

    public int hashCode() {
        return Objects.hash(this.fetcherName, this.fetchKey, Long.valueOf(this.rangeStart), Long.valueOf(this.rangeEnd));
    }

    public String toString() {
        String str = this.fetcherName;
        String str2 = this.fetchKey;
        long j = this.rangeStart;
        long j2 = this.rangeEnd;
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("FetchKey{fetcherName='", str, "', fetchKey='", str2, "', rangeStart=");
        sbOooOOo0.append(j);
        sbOooOOo0.append(", rangeEnd=");
        sbOooOOo0.append(j2);
        sbOooOOo0.append("}");
        return sbOooOOo0.toString();
    }

    public FetchKey(String str, String str2) {
        this(str, str2, -1L, -1L);
    }

    public FetchKey(String str, String str2, long j, long j2) {
        this.fetcherName = str;
        this.fetchKey = str2;
        this.rangeStart = j;
        this.rangeEnd = j2;
    }
}
