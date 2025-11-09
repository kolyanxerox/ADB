package io.flutter.plugins.sharedpreferences;

import kotlin.jvm.internal.OooOO0O;
import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class StringListLookupResultType extends Enum<StringListLookupResultType> {
    private static final /* synthetic */ oo0o0O0.OooO00o $ENTRIES;
    private static final /* synthetic */ StringListLookupResultType[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final StringListLookupResultType PLATFORM_ENCODED = new StringListLookupResultType("PLATFORM_ENCODED", 0, 0);
    public static final StringListLookupResultType JSON_ENCODED = new StringListLookupResultType("JSON_ENCODED", 1, 1);
    public static final StringListLookupResultType UNEXPECTED_STRING = new StringListLookupResultType("UNEXPECTED_STRING", 2, 2);

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final StringListLookupResultType ofRaw(int i) {
            for (StringListLookupResultType stringListLookupResultType : StringListLookupResultType.values()) {
                if (stringListLookupResultType.getRaw() == i) {
                    return stringListLookupResultType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ StringListLookupResultType[] $values() {
        return new StringListLookupResultType[]{PLATFORM_ENCODED, JSON_ENCODED, UNEXPECTED_STRING};
    }

    static {
        StringListLookupResultType[] stringListLookupResultTypeArr$values = $values();
        $VALUES = stringListLookupResultTypeArr$values;
        $ENTRIES = o00O0O0O.OooOOo(stringListLookupResultTypeArr$values);
        Companion = new Companion(null);
    }

    private StringListLookupResultType(String str, int i, int i2) {
        super(str, i);
        this.raw = i2;
    }

    public static oo0o0O0.OooO00o getEntries() {
        return $ENTRIES;
    }

    public static StringListLookupResultType valueOf(String str) {
        return (StringListLookupResultType) Enum.valueOf(StringListLookupResultType.class, str);
    }

    public static StringListLookupResultType[] values() {
        return (StringListLookupResultType[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
