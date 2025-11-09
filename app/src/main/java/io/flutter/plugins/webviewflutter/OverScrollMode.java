package io.flutter.plugins.webviewflutter;

import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class OverScrollMode extends Enum<OverScrollMode> {
    private static final /* synthetic */ oo0o0O0.OooO00o $ENTRIES;
    private static final /* synthetic */ OverScrollMode[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final OverScrollMode ALWAYS = new OverScrollMode("ALWAYS", 0, 0);
    public static final OverScrollMode IF_CONTENT_SCROLLS = new OverScrollMode("IF_CONTENT_SCROLLS", 1, 1);
    public static final OverScrollMode NEVER = new OverScrollMode("NEVER", 2, 2);
    public static final OverScrollMode UNKNOWN = new OverScrollMode("UNKNOWN", 3, 3);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final OverScrollMode ofRaw(int i) {
            for (OverScrollMode overScrollMode : OverScrollMode.values()) {
                if (overScrollMode.getRaw() == i) {
                    return overScrollMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OverScrollMode[] $values() {
        return new OverScrollMode[]{ALWAYS, IF_CONTENT_SCROLLS, NEVER, UNKNOWN};
    }

    static {
        OverScrollMode[] overScrollModeArr$values = $values();
        $VALUES = overScrollModeArr$values;
        $ENTRIES = o00O0O0O.OooOOo(overScrollModeArr$values);
        Companion = new Companion(null);
    }

    private OverScrollMode(String str, int i, int i2) {
        super(str, i);
        this.raw = i2;
    }

    public static oo0o0O0.OooO00o getEntries() {
        return $ENTRIES;
    }

    public static OverScrollMode valueOf(String str) {
        return (OverScrollMode) Enum.valueOf(OverScrollMode.class, str);
    }

    public static OverScrollMode[] values() {
        return (OverScrollMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
