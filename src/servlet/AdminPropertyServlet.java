package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PropertyDao;
import entity.Property;

@WebServlet("/AdminProperty")
public class AdminPropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int currentPage = 1;   // current page
		    int perPage = 5;   // number of properties on each page
			
			// get the required page
		    String cPage = request.getParameter("currentPage");
		    
		    // get the search keywords
		    String city = request.getParameter("city");
		    String searchMin = request.getParameter("searchMin");
		    String searchMax = request.getParameter("searchMax");
		    String searchBed = request.getParameter("searchBed");
		    String searchBath = request.getParameter("searchBath");
		    String searchStatus = request.getParameter("searchStatus");
		    
		    if(cPage!=null) {
		    	currentPage = Integer.parseInt(cPage);
		    }
		    
		    int array[] = PropertyDao.totalPage(perPage, city, searchMin, searchMax, searchBed, searchBath, searchStatus);			
			
			// get all properties
			ArrayList<Property> list = PropertyDao.searchAll(currentPage, perPage, city, searchMin, searchMax, searchBed, searchBath, searchStatus);
		
			// put the list to the request
			request.setAttribute("propertyList", list);
			request.setAttribute("totalProperty", array[0]);
			request.setAttribute("totalPage", array[1]);			
			request.setAttribute("currentPage", currentPage);
			
			if (searchStatus!=null) {
				if(city!=null) {
					if (searchMin!=null) {
						if (searchMax!=null) {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMin="+searchMin+"&searchMax="+searchMax);
								}							
							}
							
						} else {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMin="+searchMin+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMin="+searchMin+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMin="+searchMin+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMin="+searchMin);
								}							
							}						
						}
						
					} else {
						if (searchMax!=null) {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMax="+searchMax+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMax="+searchMax+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMax="+searchMax+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchMax="+searchMax);
								}							
							}
							
						} else {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&city="+city);
								}							
							}						
						}					
					}
				} else {
					if (searchMin!=null) {
						if (searchMax!=null) {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMin="+searchMin+"&searchMax="+searchMax);
								}							
							}
							
						} else {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMin="+searchMin+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMin="+searchMin+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMin="+searchMin+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMin="+searchMin);
								}							
							}						
						}
						
					} else {
						if (searchMax!=null) {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMax="+searchMax+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMax="+searchMax+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMax="+searchMax+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchMax="+searchMax);
								}							
							}
							
						} else {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchStatus="+searchStatus);
								}							
							}						
						}					
					}
				}
			} else {
				if(city!=null) {
					if (searchMin!=null) {
						if (searchMax!=null) {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&city="+city+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&city="+city+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&scity="+city+"&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&city="+city+"&searchMin="+searchMin+"&searchMax="+searchMax);
								}							
							}
							
						} else {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&city="+city+"&searchMin="+searchMin+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&city="+city+"&searchMin="+searchMin+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&city="+city+"&searchMin="+searchMin+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&city="+city+"&searchMin="+searchMin);
								}							
							}						
						}
						
					} else {
						if (searchMax!=null) {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&city="+city+"&searchMax="+searchMax+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&city="+city+"&searchMax="+searchMax+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&city="+city+"&searchMax="+searchMax+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&city="+city+"&searchMax="+searchMax);
								}							
							}
							
						} else {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&city="+city+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&city="+city+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&city="+city+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&city="+city);
								}							
							}						
						}					
					}
				} else {
					if (searchMin!=null) {
						if (searchMax!=null) {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchMin="+searchMin+"&searchMax="+searchMax+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchMin="+searchMin+"&searchMax="+searchMax);
								}							
							}
							
						} else {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchMin="+searchMin+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchMin="+searchMin+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchMin="+searchMin+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchMin="+searchMin);
								}							
							}						
						}
						
					} else {
						if (searchMax!=null) {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchMax="+searchMax+"&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchMax="+searchMax+"&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchMax="+searchMax+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchMax="+searchMax);
								}							
							}
							
						} else {
							if (searchBed!=null) {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchBed="+searchBed+"&searchBath="+searchBath);
								} else {
									request.setAttribute("searchPara", "&searchBed="+searchBed);
								}
								
							} else {
								if (searchBath!=null) {
									request.setAttribute("searchPara", "&searchBath="+searchBath);
								}
							}						
						}					
					}
				}
			}
					
			// redirect
			request.getRequestDispatcher("Admin_prop.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
}
