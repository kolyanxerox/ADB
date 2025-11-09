package com.unity3d.ads.core.data.model.exception;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0oOo.o00OOOO0;

/* loaded from: classes3.dex */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final InitializationException parseFrom(Exception e) {
            String str;
            OooOo.OooO0o0(e, "e");
            if (e instanceof o00OOOO0 ? true : e instanceof NetworkTimeoutException) {
                return new InitializationException(AndroidInitializeBoldSDK.MSG_TIMEOUT, e, "timeout", e.getMessage());
            }
            if (e instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) e;
                return new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug());
            }
            if (!(e instanceof UnityAdsNetworkException)) {
                return e instanceof InitializationException ? (InitializationException) e : new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, e, "unknown", e.getMessage());
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException(AndroidInitializeBoldSDK.MSG_NETWORK, e, str, unityAdsNetworkException.getMessage());
        }

        private Companion() {
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, int i, OooOO0O oooOO0O) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final InitializationException copy(String message, Throwable th, String reason, String str) {
        OooOo.OooO0o0(message, "message");
        OooOo.OooO0o0(reason, "reason");
        return new InitializationException(message, th, reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return OooOo.OooO00o(getMessage(), initializationException.getMessage()) && OooOo.OooO00o(this.throwable, initializationException.throwable) && OooOo.OooO00o(this.reason, initializationException.reason) && OooOo.OooO00o(this.reasonDebug, initializationException.reasonDebug);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Throwable th = this.throwable;
        int iOooO0O0 = OooO00o.OooO0O0((iHashCode + (th == null ? 0 : th.hashCode())) * 31, 31, this.reason);
        String str = this.reasonDebug;
        return iOooO0O0 + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("InitializationException(message=");
        sb.append(getMessage());
        sb.append(", throwable=");
        sb.append(this.throwable);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", reasonDebug=");
        return OooO00o.OooO0oO(')', this.reasonDebug, sb);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String message, Throwable th, String reason, String str) {
        super(message);
        OooOo.OooO0o0(message, "message");
        OooOo.OooO0o0(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
