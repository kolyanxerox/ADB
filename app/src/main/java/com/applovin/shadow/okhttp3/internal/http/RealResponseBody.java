package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.MediaType;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okio.BufferedSource;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final BufferedSource source;

    public RealResponseBody(String str, long j, BufferedSource source) {
        OooOo.OooO0o0(source, "source");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = source;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public BufferedSource source() {
        return this.source;
    }
}
