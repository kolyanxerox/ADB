package o00O0OO0;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;

/* loaded from: classes3.dex */
public abstract class OooO00o implements o00O0O0O.OooO0OO, OooO0o, Serializable {
    private final o00O0O0O.OooO0OO completion;

    public OooO00o(o00O0O0O.OooO0OO oooO0OO) {
        this.completion = oooO0OO;
    }

    public o00O0O0O.OooO0OO create(o00O0O0O.OooO0OO completion) {
        OooOo.OooO0o0(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public OooO0o getCallerFrame() {
        o00O0O0O.OooO0OO oooO0OO = this.completion;
        if (oooO0OO instanceof OooO0o) {
            return (OooO0o) oooO0OO;
        }
        return null;
    }

    public final o00O0O0O.OooO0OO getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strM13471c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        OooO oooO = (OooO) getClass().getAnnotation(OooO.class);
        String str = null;
        if (oooO == null) {
            return null;
        }
        int iM13475v = oooO.m13475v();
        if (iM13475v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM13475v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? oooO.m13473l()[iIntValue] : -1;
        OooOO0 oooOO0 = OooOO0O.f31377OooO0O0;
        OooOO0 oooOO02 = OooOO0O.f31376OooO00o;
        if (oooOO0 == null) {
            try {
                OooOO0 oooOO03 = new OooOO0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                OooOO0O.f31377OooO0O0 = oooOO03;
                oooOO0 = oooOO03;
            } catch (Exception unused2) {
                OooOO0O.f31377OooO0O0 = oooOO02;
                oooOO0 = oooOO02;
            }
        }
        if (oooOO0 != oooOO02 && (method = oooOO0.f31373OooO00o) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = oooOO0.f31374OooO0O0) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = oooOO0.f31375OooO0OO;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM13471c = oooO.m13471c();
        } else {
            strM13471c = str + '/' + oooO.m13471c();
        }
        return new StackTraceElement(strM13471c, oooO.m13474m(), oooO.m13472f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // o00O0O0O.OooO0OO
    public final void resumeWith(Object obj) {
        o00O0O0O.OooO0OO oooO0OO = this;
        while (true) {
            OooO00o oooO00o = (OooO00o) oooO0OO;
            o00O0O0O.OooO0OO oooO0OO2 = oooO00o.completion;
            OooOo.OooO0O0(oooO0OO2);
            try {
                obj = oooO00o.invokeSuspend(obj);
                if (obj == OooOo00.f31365OooOo0O) {
                    return;
                }
            } catch (Throwable th) {
                obj = o000OOo.OooO0O0(th);
            }
            oooO00o.releaseIntercepted();
            if (!(oooO0OO2 instanceof OooO00o)) {
                oooO0OO2.resumeWith(obj);
                return;
            }
            oooO0OO = oooO0OO2;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO completion) {
        OooOo.OooO0o0(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
