package Ooooo0o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o00OO00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SimpleArrayMap f15008OooO00o = new SimpleArrayMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final SimpleArrayMap f15009OooO0O0 = new SimpleArrayMap();

    public static o00OO00O OooO00o(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return OooO0O0(context, resourceId);
    }

    public static o00OO00O OooO0O0(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return OooO0OO(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return OooO0OO(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static o00OO00O OooO0OO(ArrayList arrayList) {
        o00OO00O o00oo00o = new o00OO00O();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            o00oo00o.OooO0oo(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = oo0o0O0.f15016OooO0O0;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = oo0o0O0.f15017OooO0OO;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = oo0o0O0.f15018OooO0Oo;
            }
            o00OO0O0 o00oo0o0 = new o00OO0O0();
            o00oo0o0.f15013OooO0Oo = 0;
            o00oo0o0.f15014OooO0o0 = 1;
            o00oo0o0.f15010OooO00o = startDelay;
            o00oo0o0.f15011OooO0O0 = duration;
            o00oo0o0.f15012OooO0OO = interpolator;
            o00oo0o0.f15013OooO0Oo = objectAnimator.getRepeatCount();
            o00oo0o0.f15014OooO0o0 = objectAnimator.getRepeatMode();
            o00oo00o.f15008OooO00o.put(propertyName, o00oo0o0);
        }
        return o00oo00o;
    }

    public final ObjectAnimator OooO0Oo(String str, Object obj, Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, OooO0o0(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        OooO0o(str).OooO00o(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final o00OO0O0 OooO0o(String str) {
        SimpleArrayMap simpleArrayMap = this.f15008OooO00o;
        if (simpleArrayMap.get(str) != null) {
            return (o00OO0O0) simpleArrayMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final PropertyValuesHolder[] OooO0o0(String str) {
        if (!OooO0oO(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f15009OooO0O0.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final boolean OooO0oO(String str) {
        return this.f15009OooO0O0.get(str) != null;
    }

    public final void OooO0oo(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f15009OooO0O0.put(str, propertyValuesHolderArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00OO00O) {
            return this.f15008OooO00o.equals(((o00OO00O) obj).f15008OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15008OooO00o.hashCode();
    }

    public final String toString() {
        return "\n" + o00OO00O.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f15008OooO00o + "}\n";
    }
}
