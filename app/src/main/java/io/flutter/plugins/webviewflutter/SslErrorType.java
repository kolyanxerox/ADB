package io.flutter.plugins.webviewflutter;

import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class SslErrorType extends Enum<SslErrorType> {
    private static final /* synthetic */ oo0o0O0.OooO00o $ENTRIES;
    private static final /* synthetic */ SslErrorType[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final SslErrorType DATE_INVALID = new SslErrorType("DATE_INVALID", 0, 0);
    public static final SslErrorType EXPIRED = new SslErrorType("EXPIRED", 1, 1);
    public static final SslErrorType ID_MISMATCH = new SslErrorType("ID_MISMATCH", 2, 2);
    public static final SslErrorType INVALID = new SslErrorType("INVALID", 3, 3);
    public static final SslErrorType NOT_YET_VALID = new SslErrorType("NOT_YET_VALID", 4, 4);
    public static final SslErrorType UNTRUSTED = new SslErrorType("UNTRUSTED", 5, 5);
    public static final SslErrorType UNKNOWN = new SslErrorType("UNKNOWN", 6, 6);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final SslErrorType ofRaw(int i) {
            for (SslErrorType sslErrorType : SslErrorType.values()) {
                if (sslErrorType.getRaw() == i) {
                    return sslErrorType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SslErrorType[] $values() {
        return new SslErrorType[]{DATE_INVALID, EXPIRED, ID_MISMATCH, INVALID, NOT_YET_VALID, UNTRUSTED, UNKNOWN};
    }

    static {
        SslErrorType[] sslErrorTypeArr$values = $values();
        $VALUES = sslErrorTypeArr$values;
        $ENTRIES = o00O0O0O.OooOOo(sslErrorTypeArr$values);
        Companion = new Companion(null);
    }

    private SslErrorType(String str, int i, int i2) {
        super(str, i);
        this.raw = i2;
    }

    public static oo0o0O0.OooO00o getEntries() {
        return $ENTRIES;
    }

    public static SslErrorType valueOf(String str) {
        return (SslErrorType) Enum.valueOf(SslErrorType.class, str);
    }

    public static SslErrorType[] values() {
        return (SslErrorType[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
