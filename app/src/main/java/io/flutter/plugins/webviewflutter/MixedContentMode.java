package io.flutter.plugins.webviewflutter;

import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class MixedContentMode extends Enum<MixedContentMode> {
    private static final /* synthetic */ oo0o0O0.OooO00o $ENTRIES;
    private static final /* synthetic */ MixedContentMode[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final MixedContentMode ALWAYS_ALLOW = new MixedContentMode("ALWAYS_ALLOW", 0, 0);
    public static final MixedContentMode COMPATIBILITY_MODE = new MixedContentMode("COMPATIBILITY_MODE", 1, 1);
    public static final MixedContentMode NEVER_ALLOW = new MixedContentMode("NEVER_ALLOW", 2, 2);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final MixedContentMode ofRaw(int i) {
            for (MixedContentMode mixedContentMode : MixedContentMode.values()) {
                if (mixedContentMode.getRaw() == i) {
                    return mixedContentMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MixedContentMode[] $values() {
        return new MixedContentMode[]{ALWAYS_ALLOW, COMPATIBILITY_MODE, NEVER_ALLOW};
    }

    static {
        MixedContentMode[] mixedContentModeArr$values = $values();
        $VALUES = mixedContentModeArr$values;
        $ENTRIES = o00O0O0O.OooOOo(mixedContentModeArr$values);
        Companion = new Companion(null);
    }

    private MixedContentMode(String str, int i, int i2) {
        super(str, i);
        this.raw = i2;
    }

    public static oo0o0O0.OooO00o getEntries() {
        return $ENTRIES;
    }

    public static MixedContentMode valueOf(String str) {
        return (MixedContentMode) Enum.valueOf(MixedContentMode.class, str);
    }

    public static MixedContentMode[] values() {
        return (MixedContentMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
