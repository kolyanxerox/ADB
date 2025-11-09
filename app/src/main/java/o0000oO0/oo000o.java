package o0000oo0;

import OooO0oO.OooOo;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import o0000o0.Oooo0;
import o000Oo00.OooOOO;

/* loaded from: classes2.dex */
public final /* synthetic */ class oo000o implements OooOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29691OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f29692OooO0O0;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f29691OooO00o = i;
        this.f29692OooO0O0 = obj;
    }

    @Override // o000Oo00.OooOOO
    public final Object get() throws ClassNotFoundException {
        switch (this.f29691OooO00o) {
            case 0:
                String str = (String) this.f29692OooO0O0;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new o000000("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new o000000(OooOo.OooOO0O("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new o000000(OooOo.OooOO0O("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new o000000(OooOo.OooOO0("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new o000000(OooOo.OooOO0("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.f29692OooO0O0;
            default:
                return new o000Oo0o.o0OOO0o((Oooo0) this.f29692OooO0O0);
        }
    }
}
