package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;

/* loaded from: classes3.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final NonBehavioralFlag fromString(String value) {
            Object objOooO0O0;
            OooOo.OooO0o0(value, "value");
            try {
                String upperCase = value.toUpperCase(Locale.ROOT);
                OooOo.OooO0Oo(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objOooO0O0 = NonBehavioralFlag.valueOf(upperCase);
            } catch (Throwable th) {
                objOooO0O0 = o000OOo.OooO0O0(th);
            }
            Object obj = NonBehavioralFlag.UNKNOWN;
            if (objOooO0O0 instanceof oo00o.OooOO0O) {
                objOooO0O0 = obj;
            }
            return (NonBehavioralFlag) objOooO0O0;
        }

        private Companion() {
        }
    }
}
