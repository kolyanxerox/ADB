package io.flutter.plugins.webviewflutter;

import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class ConsoleMessageLevel extends Enum<ConsoleMessageLevel> {
    private static final /* synthetic */ oo0o0O0.OooO00o $ENTRIES;
    private static final /* synthetic */ ConsoleMessageLevel[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final ConsoleMessageLevel DEBUG = new ConsoleMessageLevel("DEBUG", 0, 0);
    public static final ConsoleMessageLevel ERROR = new ConsoleMessageLevel("ERROR", 1, 1);
    public static final ConsoleMessageLevel LOG = new ConsoleMessageLevel("LOG", 2, 2);
    public static final ConsoleMessageLevel TIP = new ConsoleMessageLevel("TIP", 3, 3);
    public static final ConsoleMessageLevel WARNING = new ConsoleMessageLevel("WARNING", 4, 4);
    public static final ConsoleMessageLevel UNKNOWN = new ConsoleMessageLevel("UNKNOWN", 5, 5);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final ConsoleMessageLevel ofRaw(int i) {
            for (ConsoleMessageLevel consoleMessageLevel : ConsoleMessageLevel.values()) {
                if (consoleMessageLevel.getRaw() == i) {
                    return consoleMessageLevel;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ConsoleMessageLevel[] $values() {
        return new ConsoleMessageLevel[]{DEBUG, ERROR, LOG, TIP, WARNING, UNKNOWN};
    }

    static {
        ConsoleMessageLevel[] consoleMessageLevelArr$values = $values();
        $VALUES = consoleMessageLevelArr$values;
        $ENTRIES = o00O0O0O.OooOOo(consoleMessageLevelArr$values);
        Companion = new Companion(null);
    }

    private ConsoleMessageLevel(String str, int i, int i2) {
        super(str, i);
        this.raw = i2;
    }

    public static oo0o0O0.OooO00o getEntries() {
        return $ENTRIES;
    }

    public static ConsoleMessageLevel valueOf(String str) {
        return (ConsoleMessageLevel) Enum.valueOf(ConsoleMessageLevel.class, str);
    }

    public static ConsoleMessageLevel[] values() {
        return (ConsoleMessageLevel[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
