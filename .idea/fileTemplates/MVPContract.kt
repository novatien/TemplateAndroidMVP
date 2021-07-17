#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME} #end

#parse("File Header.java")
interface ${Name_Base}View

interface ${Name_Base}Presenter : BasePresenter