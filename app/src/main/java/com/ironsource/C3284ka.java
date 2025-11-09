package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.ironsource.ka */
/* loaded from: classes2.dex */
final class C3284ka implements InterfaceC3794w8 {

    /* renamed from: a */
    public static final C3284ka f9253a = new C3284ka();

    private C3284ka() {
    }

    @Override // com.ironsource.InterfaceC3794w8
    /* renamed from: a */
    public InputStream mo9660a(String url) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
        InputStream inputStreamOpenStream = new URL(url).openStream();
        kotlin.jvm.internal.OooOo.OooO0Oo(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
