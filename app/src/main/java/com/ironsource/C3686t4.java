package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.t4 */
/* loaded from: classes2.dex */
public final class C3686t4 implements InterfaceC2957b2 {

    /* renamed from: a */
    private final C3244j5 f11996a;

    /* renamed from: com.ironsource.t4$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11997a;

        static {
            int[] iArr = new int[EnumC3889z1.values().length];
            try {
                iArr[EnumC3889z1.LOAD_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3889z1.LOAD_AD_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3889z1.LOAD_AD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3889z1.LOAD_AD_FAILED_WITH_REASON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3889z1.AUCTION_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3889z1.AUCTION_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3889z1.AUCTION_FAILED_NO_CANDIDATES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3889z1.LOAD_AD_NO_FILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC3889z1.AD_OPENED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC3889z1.AD_CLOSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC3889z1.SHOW_AD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC3889z1.SHOW_AD_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC3889z1.AD_CLICKED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC3889z1.AD_REWARDED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC3889z1.RELOAD_AD_FAILED_WITH_REASON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC3889z1.RELOAD_AD_SUCCESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC3889z1.AD_LEFT_APPLICATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f11997a = iArr;
        }
    }

    public C3686t4(C3244j5 auctionData) {
        kotlin.jvm.internal.OooOo.OooO0o0(auctionData, "auctionData");
        this.f11996a = auctionData;
    }

    /* renamed from: b */
    private final boolean m12360b(EnumC3889z1 enumC3889z1) {
        switch (a.f11997a[enumC3889z1.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                return false;
        }
    }

    @Override // com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 event) {
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        HashMap map = new HashMap();
        JSONObject jSONObjectM9439h = this.f11996a.m9439h();
        if (jSONObjectM9439h != null && jSONObjectM9439h.length() > 0) {
            map.put("genericParams", jSONObjectM9439h);
        }
        if (m12360b(event)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f11996a.m9440i()));
            if (!TextUtils.isEmpty(this.f11996a.m9437f())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f11996a.m9437f());
            }
        }
        if (!TextUtils.isEmpty(this.f11996a.m9438g())) {
            map.put("auctionId", this.f11996a.m9438g());
        }
        return map;
    }
}
