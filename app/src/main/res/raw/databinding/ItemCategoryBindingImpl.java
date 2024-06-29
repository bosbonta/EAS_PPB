package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.ItemCategoryBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCategoryBindingImpl extends ItemCategoryBinding implements com.shopping.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ItemCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[0]
            );
        this.btnCategory.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.shopping.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.categoryAdapter == variableId) {
            setCategoryAdapter((com.shopping.app.ui.main.search.adapter.CategoryAdapter) variable);
        }
        else if (BR.dataHolder == variableId) {
            setDataHolder((com.shopping.app.data.model.CategoryModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCategoryAdapter(@Nullable com.shopping.app.ui.main.search.adapter.CategoryAdapter CategoryAdapter) {
        this.mCategoryAdapter = CategoryAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.categoryAdapter);
        super.requestRebind();
    }
    public void setDataHolder(@Nullable com.shopping.app.data.model.CategoryModel DataHolder) {
        this.mDataHolder = DataHolder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dataHolder);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int dataHolderSelectedBtnCategoryAndroidColorWhiteBtnCategoryAndroidColorMainColor = 0;
        boolean dataHolderSelected = false;
        android.graphics.drawable.Drawable dataHolderSelectedBtnCategoryAndroidDrawableBgCategorySelectedButtonBtnCategoryAndroidDrawableBgCategoryButton = null;
        java.lang.String dataHolderCategoryName = null;
        com.shopping.app.ui.main.search.adapter.CategoryAdapter categoryAdapter = mCategoryAdapter;
        com.shopping.app.data.model.CategoryModel dataHolder = mDataHolder;

        if ((dirtyFlags & 0x6L) != 0) {



                if (dataHolder != null) {
                    // read dataHolder.selected
                    dataHolderSelected = dataHolder.isSelected();
                    // read dataHolder.categoryName
                    dataHolderCategoryName = dataHolder.getCategoryName();
                }
            if((dirtyFlags & 0x6L) != 0) {
                if(dataHolderSelected) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read dataHolder.selected ? @android:color/white : @android:color/main_color
                dataHolderSelectedBtnCategoryAndroidColorWhiteBtnCategoryAndroidColorMainColor = ((dataHolderSelected) ? (getColorFromResource(btnCategory, R.color.white)) : (getColorFromResource(btnCategory, R.color.main_color)));
                // read dataHolder.selected ? @android:drawable/bg_category_selected_button : @android:drawable/bg_category_button
                dataHolderSelectedBtnCategoryAndroidDrawableBgCategorySelectedButtonBtnCategoryAndroidDrawableBgCategoryButton = ((dataHolderSelected) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnCategory.getContext(), R.drawable.bg_category_selected_button)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnCategory.getContext(), R.drawable.bg_category_button)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnCategory, dataHolderCategoryName);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnCategory, dataHolderSelectedBtnCategoryAndroidDrawableBgCategorySelectedButtonBtnCategoryAndroidDrawableBgCategoryButton);
            this.btnCategory.setTextColor(dataHolderSelectedBtnCategoryAndroidColorWhiteBtnCategoryAndroidColorMainColor);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnCategory.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // categoryAdapter.listener != null
        boolean categoryAdapterListenerJavaLangObjectNull = false;
        // categoryAdapter
        com.shopping.app.ui.main.search.adapter.CategoryAdapter categoryAdapter = mCategoryAdapter;
        // categoryAdapter != null
        boolean categoryAdapterJavaLangObjectNull = false;
        // categoryAdapter.listener
        com.shopping.app.ui.main.search.CategoryClickListener categoryAdapterListener = null;
        // dataHolder
        com.shopping.app.data.model.CategoryModel dataHolder = mDataHolder;



        categoryAdapterJavaLangObjectNull = (categoryAdapter) != (null);
        if (categoryAdapterJavaLangObjectNull) {


            categoryAdapterListener = categoryAdapter.getListener();

            categoryAdapterListenerJavaLangObjectNull = (categoryAdapterListener) != (null);
            if (categoryAdapterListenerJavaLangObjectNull) {



                categoryAdapterListener.onClickCategory(dataHolder);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): categoryAdapter
        flag 1 (0x2L): dataHolder
        flag 2 (0x3L): null
        flag 3 (0x4L): dataHolder.selected ? @android:color/white : @android:color/main_color
        flag 4 (0x5L): dataHolder.selected ? @android:color/white : @android:color/main_color
        flag 5 (0x6L): dataHolder.selected ? @android:drawable/bg_category_selected_button : @android:drawable/bg_category_button
        flag 6 (0x7L): dataHolder.selected ? @android:drawable/bg_category_selected_button : @android:drawable/bg_category_button
    flag mapping end*/
    //end
}