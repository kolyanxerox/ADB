package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String url) {
        OooOo.OooO0o0(url, "url");
        String string = Uri.parse(url).buildUpon().clearQuery().build().toString();
        OooOo.OooO0Oo(string, "parse(url).buildUpon().c…uery().build().toString()");
        return string;
    }
}
