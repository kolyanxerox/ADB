package androidx.window.embedding;

import androidx.window.core.SpecificationComputer;
import androidx.window.core.VerificationMode;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class SplitAttributes {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SplitAttributes";
    private final LayoutDirection layoutDirection;
    private final SplitType splitType;

    public static final class Builder {
        private SplitType splitType = SplitType.SPLIT_TYPE_EQUAL;
        private LayoutDirection layoutDirection = LayoutDirection.LOCALE;

        public final SplitAttributes build() {
            return new SplitAttributes(this.splitType, this.layoutDirection);
        }

        public final Builder setLayoutDirection(LayoutDirection layoutDirection) {
            OooOo.OooO0o0(layoutDirection, "layoutDirection");
            this.layoutDirection = layoutDirection;
            return this;
        }

        public final Builder setSplitType(SplitType type) {
            OooOo.OooO0o0(type, "type");
            this.splitType = type;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public static final class LayoutDirection {
        private final String description;
        private final int value;
        public static final Companion Companion = new Companion(null);
        public static final LayoutDirection LOCALE = new LayoutDirection("LOCALE", 0);
        public static final LayoutDirection LEFT_TO_RIGHT = new LayoutDirection("LEFT_TO_RIGHT", 1);
        public static final LayoutDirection RIGHT_TO_LEFT = new LayoutDirection("RIGHT_TO_LEFT", 2);
        public static final LayoutDirection TOP_TO_BOTTOM = new LayoutDirection("TOP_TO_BOTTOM", 3);
        public static final LayoutDirection BOTTOM_TO_TOP = new LayoutDirection("BOTTOM_TO_TOP", 4);

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
                this();
            }

            public final LayoutDirection getLayoutDirectionFromValue$window_release(int i) {
                LayoutDirection layoutDirection = LayoutDirection.LEFT_TO_RIGHT;
                if (i == layoutDirection.getValue$window_release()) {
                    return layoutDirection;
                }
                LayoutDirection layoutDirection2 = LayoutDirection.RIGHT_TO_LEFT;
                if (i == layoutDirection2.getValue$window_release()) {
                    return layoutDirection2;
                }
                LayoutDirection layoutDirection3 = LayoutDirection.LOCALE;
                if (i == layoutDirection3.getValue$window_release()) {
                    return layoutDirection3;
                }
                LayoutDirection layoutDirection4 = LayoutDirection.TOP_TO_BOTTOM;
                if (i == layoutDirection4.getValue$window_release()) {
                    return layoutDirection4;
                }
                LayoutDirection layoutDirection5 = LayoutDirection.BOTTOM_TO_TOP;
                if (i == layoutDirection5.getValue$window_release()) {
                    return layoutDirection5;
                }
                throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "Undefined value:"));
            }

            private Companion() {
            }
        }

        private LayoutDirection(String str, int i) {
            this.description = str;
            this.value = i;
        }

        public final int getValue$window_release() {
            return this.value;
        }

        public String toString() {
            return this.description;
        }
    }

    public static final class SplitType {
        public static final Companion Companion;
        public static final SplitType SPLIT_TYPE_EQUAL;
        public static final SplitType SPLIT_TYPE_EXPAND;
        public static final SplitType SPLIT_TYPE_HINGE;
        private final String description;
        private final float value;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
                this();
            }

            public final SplitType buildSplitTypeFromValue$window_release(float f) {
                SplitType splitType = SplitType.SPLIT_TYPE_EXPAND;
                return f == splitType.getValue$window_release() ? splitType : ratio(f);
            }

            public final SplitType ratio(float f) {
                SpecificationComputer.Companion companion = SpecificationComputer.Companion;
                Float fValueOf = Float.valueOf(f);
                String TAG = SplitAttributes.TAG;
                OooOo.OooO0Oo(TAG, "TAG");
                Object objCompute = SpecificationComputer.Companion.startSpecification$default(companion, fValueOf, TAG, VerificationMode.STRICT, null, 4, null).require("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new SplitAttributes$SplitType$Companion$ratio$checkedRatio$1(f)).compute();
                OooOo.OooO0O0(objCompute);
                float fFloatValue = ((Number) objCompute).floatValue();
                return new SplitType("ratio:" + fFloatValue, fFloatValue);
            }

            private Companion() {
            }
        }

        static {
            Companion companion = new Companion(null);
            Companion = companion;
            SPLIT_TYPE_EXPAND = new SplitType("expandContainers", 0.0f);
            SPLIT_TYPE_EQUAL = companion.ratio(0.5f);
            SPLIT_TYPE_HINGE = new SplitType("hinge", -1.0f);
        }

        public SplitType(String description, float f) {
            OooOo.OooO0o0(description, "description");
            this.description = description;
            this.value = f;
        }

        public static final SplitType ratio(float f) {
            return Companion.ratio(f);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SplitType)) {
                return false;
            }
            SplitType splitType = (SplitType) obj;
            return this.value == splitType.value && OooOo.OooO00o(this.description, splitType.description);
        }

        public final String getDescription$window_release() {
            return this.description;
        }

        public final float getValue$window_release() {
            return this.value;
        }

        public int hashCode() {
            return (Float.hashCode(this.value) * 31) + this.description.hashCode();
        }

        public String toString() {
            return this.description;
        }
    }

    public SplitAttributes() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitAttributes)) {
            return false;
        }
        SplitAttributes splitAttributes = (SplitAttributes) obj;
        return OooOo.OooO00o(this.splitType, splitAttributes.splitType) && OooOo.OooO00o(this.layoutDirection, splitAttributes.layoutDirection);
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final SplitType getSplitType() {
        return this.splitType;
    }

    public int hashCode() {
        return this.layoutDirection.hashCode() + (this.splitType.hashCode() * 31);
    }

    public String toString() {
        return "SplitAttributes:{splitType=" + this.splitType + ", layoutDir=" + this.layoutDirection + " }";
    }

    public SplitAttributes(SplitType splitType, LayoutDirection layoutDirection) {
        OooOo.OooO0o0(splitType, "splitType");
        OooOo.OooO0o0(layoutDirection, "layoutDirection");
        this.splitType = splitType;
        this.layoutDirection = layoutDirection;
    }

    public /* synthetic */ SplitAttributes(SplitType splitType, LayoutDirection layoutDirection, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? SplitType.SPLIT_TYPE_EQUAL : splitType, (i & 2) != 0 ? LayoutDirection.LOCALE : layoutDirection);
    }
}
