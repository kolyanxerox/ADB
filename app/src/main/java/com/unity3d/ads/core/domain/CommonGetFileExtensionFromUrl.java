package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.OooOo;
import o00O0oO.o000000;

/* loaded from: classes3.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        OooOo.OooO0o0(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public String invoke(String url) {
        OooOo.OooO0o0(url, "url");
        String strInvoke = this.removeUrlQuery.invoke(url);
        if (strInvoke == null) {
            return null;
        }
        String strOooooOo = o000000.OooooOo('/', strInvoke, strInvoke);
        if (!o000000.Oooo0o0(strOooooOo, '.')) {
            return null;
        }
        String strOooooOo2 = o000000.OooooOo('.', strOooooOo, strOooooOo);
        if (strOooooOo2.length() == 0) {
            return null;
        }
        return strOooooOo2;
    }
}
