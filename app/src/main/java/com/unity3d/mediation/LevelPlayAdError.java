package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class LevelPlayAdError {
    public static final C4200a Companion = new C4200a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* renamed from: a */
    private final IronSourceError f13118a;

    /* renamed from: b */
    private final String f13119b;

    /* renamed from: c */
    private final String f13120c;

    /* renamed from: com.unity3d.mediation.LevelPlayAdError$a */
    public static final class C4200a {
        private C4200a() {
        }

        public /* synthetic */ C4200a(OooOO0O oooOO0O) {
            this();
        }
    }

    public LevelPlayAdError(IronSourceError ironSourceError, String adId, String str) {
        OooOo.OooO0o0(adId, "adId");
        this.f13118a = ironSourceError;
        this.f13119b = adId;
        this.f13120c = str;
    }

    public final String getAdId() {
        return this.f13119b;
    }

    public final String getAdUnitId() {
        return this.f13120c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f13118a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f13118a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("adUnitId: ");
        sb.append(this.f13120c);
        sb.append(' ');
        IronSourceError ironSourceError = this.f13118a;
        sb.append(ironSourceError != null ? ironSourceError.toString() : null);
        return sb.toString();
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i, OooOO0O oooOO0O) {
        this(ironSourceError, str, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(String adId, String adUnitId, int i, String errorMessage) {
        this(new IronSourceError(i, errorMessage), adId, adUnitId);
        OooOo.OooO0o0(adId, "adId");
        OooOo.OooO0o0(adUnitId, "adUnitId");
        OooOo.OooO0o0(errorMessage, "errorMessage");
    }
}
