package io.flutter.plugins.webviewflutter;

import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class FileChooserMode extends Enum<FileChooserMode> {
    private static final /* synthetic */ oo0o0O0.OooO00o $ENTRIES;
    private static final /* synthetic */ FileChooserMode[] $VALUES;
    public static final Companion Companion;
    public static final FileChooserMode OPEN = new FileChooserMode("OPEN", 0, 0);
    public static final FileChooserMode OPEN_MULTIPLE = new FileChooserMode("OPEN_MULTIPLE", 1, 1);
    public static final FileChooserMode SAVE = new FileChooserMode("SAVE", 2, 2);
    public static final FileChooserMode UNKNOWN = new FileChooserMode("UNKNOWN", 3, 3);
    private final int raw;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final FileChooserMode ofRaw(int i) {
            for (FileChooserMode fileChooserMode : FileChooserMode.values()) {
                if (fileChooserMode.getRaw() == i) {
                    return fileChooserMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FileChooserMode[] $values() {
        return new FileChooserMode[]{OPEN, OPEN_MULTIPLE, SAVE, UNKNOWN};
    }

    static {
        FileChooserMode[] fileChooserModeArr$values = $values();
        $VALUES = fileChooserModeArr$values;
        $ENTRIES = o00O0O0O.OooOOo(fileChooserModeArr$values);
        Companion = new Companion(null);
    }

    private FileChooserMode(String str, int i, int i2) {
        super(str, i);
        this.raw = i2;
    }

    public static oo0o0O0.OooO00o getEntries() {
        return $ENTRIES;
    }

    public static FileChooserMode valueOf(String str) {
        return (FileChooserMode) Enum.valueOf(FileChooserMode.class, str);
    }

    public static FileChooserMode[] values() {
        return (FileChooserMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
