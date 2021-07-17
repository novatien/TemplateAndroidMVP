#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME} #end

import javax.inject.Inject

class ${Name_Presenter}Impl @Inject constructor(private var view: ${Name_View}?) : ${Name_Presenter} {

    override fun onStart() {
        // No-op
    }

    override fun onStop() {
        // No-op
    }

    override fun onDestroy() {
        view = null
    }
}