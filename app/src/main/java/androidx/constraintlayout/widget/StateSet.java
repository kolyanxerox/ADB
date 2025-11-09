package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    ConstraintSet mDefaultConstraintSet;
    int mDefaultState = -1;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    public static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0189R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C0189R.styleable.State_android_id) {
                    this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == C0189R.styleable.State_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f, float f2) {
            for (int i = 0; i < this.mVariants.size(); i++) {
                if (this.mVariants.get(i).match(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static class Variant {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0189R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C0189R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                } else if (index == C0189R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == C0189R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == C0189R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == C0189R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean match(float f, float f2) {
            if (!Float.isNaN(this.mMinWidth) && f < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f2 < this.mMinHeight) {
                return false;
            }
            if (Float.isNaN(this.mMaxWidth) || f <= this.mMaxWidth) {
                return Float.isNaN(this.mMaxHeight) || f2 <= this.mMaxHeight;
            }
            return false;
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        load(context, xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void load(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = androidx.constraintlayout.widget.C0189R.styleable.StateSet
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.C0189R.styleable.StateSet_defaultState
            if (r4 != r5) goto L22
            int r5 = r8.mDefaultState
            int r4 = r0.getResourceId(r4, r5)
            r8.mDefaultState = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            int r0 = r10.getEventType()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r1 = 0
        L2a:
            r3 = 1
            if (r0 == r3) goto Lc5
            if (r0 == 0) goto Lb5
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L4b
            if (r0 == r5) goto L39
            goto Lb8
        L39:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r0 == 0) goto Lb8
            goto Lc5
        L45:
            r9 = move-exception
            goto Lbe
        L48:
            r9 = move-exception
            goto Lc2
        L4b:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            int r7 = r0.hashCode()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            switch(r7) {
                case 80204913: goto L73;
                case 1301459538: goto L69;
                case 1382829617: goto L61;
                case 1901439077: goto L57;
                default: goto L56;
            }     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
        L56:
            goto L7d
        L57:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r4 == 0) goto L7d
            r4 = r5
            goto L7e
        L61:
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r4 == 0) goto L7d
            r4 = r3
            goto L7e
        L69:
            java.lang.String r4 = "LayoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r4 == 0) goto L7d
            r4 = r2
            goto L7e
        L73:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r4 == 0) goto L7d
            r4 = r6
            goto L7e
        L7d:
            r4 = -1
        L7e:
            if (r4 == 0) goto Lb8
            if (r4 == r3) goto Lb8
            if (r4 == r6) goto La8
            if (r4 == r5) goto L9d
            java.lang.String r3 = "ConstraintLayoutStates"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r4.<init>()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.String r5 = "unknown tag "
            r4.append(r5)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r4.append(r0)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.String r0 = r4.toString()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            android.util.Log.v(r3, r0)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto Lb8
        L9d:
            androidx.constraintlayout.widget.StateSet$Variant r0 = new androidx.constraintlayout.widget.StateSet$Variant     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            if (r1 == 0) goto Lb8
            r1.add(r0)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto Lb8
        La8:
            androidx.constraintlayout.widget.StateSet$State r1 = new androidx.constraintlayout.widget.StateSet$State     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r0 = r8.mStateList     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            int r3 = r1.mId     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            r0.put(r3, r1)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto Lb8
        Lb5:
            r10.getName()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
        Lb8:
            int r0 = r10.next()     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L48
            goto L2a
        Lbe:
            r9.printStackTrace()
            goto Lc5
        Lc2:
            r9.printStackTrace()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.StateSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public int convertToConstraintSet(int i, int i2, float f, float f2) {
        State state = this.mStateList.get(i2);
        if (state == null) {
            return i2;
        }
        int i3 = 0;
        if (f != -1.0f && f2 != -1.0f) {
            ArrayList<Variant> arrayList = state.mVariants;
            int size = arrayList.size();
            Variant variant = null;
            while (i3 < size) {
                Variant variant2 = arrayList.get(i3);
                i3++;
                Variant variant3 = variant2;
                if (variant3.match(f, f2)) {
                    if (i != variant3.mConstraintID) {
                        variant = variant3;
                    }
                }
            }
            return variant != null ? variant.mConstraintID : state.mConstraintID;
        }
        if (state.mConstraintID != i) {
            ArrayList<Variant> arrayList2 = state.mVariants;
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Variant variant4 = arrayList2.get(i3);
                i3++;
                if (i == variant4.mConstraintID) {
                }
            }
            return state.mConstraintID;
        }
        return i;
    }

    public boolean needsToChange(int i, float f, float f2) {
        int i2 = this.mCurrentStateId;
        if (i2 != i) {
            return true;
        }
        State stateValueAt = i == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i2);
        int i3 = this.mCurrentConstraintNumber;
        return (i3 == -1 || !stateValueAt.mVariants.get(i3).match(f, f2)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(f, f2);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i, int i2, int i3) {
        return updateConstraints(-1, i, i2, i3);
    }

    public int updateConstraints(int i, int i2, float f, float f2) {
        int iFindMatch;
        if (i == i2) {
            State stateValueAt = i2 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(this.mCurrentStateId);
            if (stateValueAt == null) {
                return -1;
            }
            return ((this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(i).match(f, f2)) && i != (iFindMatch = stateValueAt.findMatch(f, f2))) ? iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID : i;
        }
        State state = this.mStateList.get(i2);
        if (state == null) {
            return -1;
        }
        int iFindMatch2 = state.findMatch(f, f2);
        return iFindMatch2 == -1 ? state.mConstraintID : state.mVariants.get(iFindMatch2).mConstraintID;
    }
}
