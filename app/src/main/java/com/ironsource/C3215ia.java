package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceAES;

/* renamed from: com.ironsource.ia */
/* loaded from: classes2.dex */
public final class C3215ia implements InterfaceC3536pt<String> {

    /* renamed from: a */
    private final String f9004a;

    /* renamed from: b */
    private final String f9005b;

    public C3215ia(String encryptedResponse, String descriptionKey) {
        kotlin.jvm.internal.OooOo.OooO0o0(encryptedResponse, "encryptedResponse");
        kotlin.jvm.internal.OooOo.OooO0o0(descriptionKey, "descriptionKey");
        this.f9004a = encryptedResponse;
        this.f9005b = descriptionKey;
    }

    @Override // com.ironsource.InterfaceC3536pt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo7938a() {
        String value = IronSourceAES.decode(this.f9005b, this.f9004a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        kotlin.jvm.internal.OooOo.OooO0Oo(value, "value");
        return value;
    }
}
