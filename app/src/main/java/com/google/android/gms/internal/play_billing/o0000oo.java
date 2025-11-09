package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.lm0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public enum o0000oo {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* renamed from: OooOo */
    public static final o000O00 f26990OooOo;

    /* renamed from: OooOo0O */
    public final int f26993OooOo0O;

    /* renamed from: EF18 */
    o0000oo SERVICE_TIMEOUT;

    /* renamed from: EF27 */
    o0000oo FEATURE_NOT_SUPPORTED;

    /* renamed from: EF36 */
    o0000oo SERVICE_DISCONNECTED;

    /* renamed from: EF45 */
    o0000oo OK;

    /* renamed from: EF53 */
    o0000oo USER_CANCELED;

    /* renamed from: EF63 */
    o0000oo SERVICE_UNAVAILABLE;

    /* renamed from: EF71 */
    o0000oo BILLING_UNAVAILABLE;

    /* renamed from: EF82 */
    o0000oo ITEM_UNAVAILABLE;

    /* renamed from: EF91 */
    o0000oo DEVELOPER_ERROR;

    /* renamed from: EF100 */
    o0000oo ERROR;

    /* renamed from: EF109 */
    o0000oo ITEM_ALREADY_OWNED;

    /* renamed from: EF118 */
    o0000oo ITEM_NOT_OWNED;

    /* renamed from: EF131 */
    o0000oo EXPIRED_OFFER_TOKEN;

    /* renamed from: EF145 */
    o0000oo NETWORK_ERROR;

    static {
        OoooO0O.o0000O00 o0000o00 = new OoooO0O.o0000O00(2, (byte) 0);
        o0000o00.f13929OooO0OO = new Object[8];
        o0000o00.f13928OooO0O0 = 0;
        for (o0000oo o0000ooVar : values()) {
            Integer numValueOf = Integer.valueOf(o0000ooVar.f26993OooOo0O);
            int i = o0000o00.f13928OooO0O0 + 1;
            Object[] objArr = (Object[]) o0000o00.f13929OooO0OO;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                o0000o00.f13929OooO0OO = Arrays.copyOf(objArr, lm0.OooO0OO(length, i2));
            }
            Object[] objArr2 = (Object[]) o0000o00.f13929OooO0OO;
            int i3 = o0000o00.f13928OooO0O0;
            int i4 = i3 + i3;
            objArr2[i4] = numValueOf;
            objArr2[i4 + 1] = o0000ooVar;
            o0000o00.f13928OooO0O0 = i3 + 1;
        }
        o000000O o000000o2 = (o000000O) o0000o00.f13930OooO0Oo;
        if (o000000o2 != null) {
            throw o000000o2.OooO00o();
        }
        o000O00 o000o00OooO00o = o000O00.OooO00o(o0000o00.f13928OooO0O0, (Object[]) o0000o00.f13929OooO0OO, o0000o00);
        o000000O o000000o3 = (o000000O) o0000o00.f13930OooO0Oo;
        if (o000000o3 != null) {
            throw o000000o3.OooO00o();
        }
        f26990OooOo = o000o00OooO00o;
    }

    o0000oo(int i) {
        this.f26993OooOo0O = i;
    }
}
